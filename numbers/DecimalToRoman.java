import java.util.LinkedHashMap;
import java.util.Map;

public class DecimalToRoman {
    Map<Integer, String> romans = new LinkedHashMap<>();

    DecimalToRoman() {
        // Must be in descending order for the logic to work correctly
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");
    }

    public static void main(String[] args) {
        DecimalToRoman x = new DecimalToRoman();
        int[] testCases = {0, 1, 4, 9, 10, 14, 44, 99, 1994};
        
        for (int t : testCases) {
            System.out.println(t + ": " + x.checkRoman(t));
        }
    }

    String checkRoman(int n) {
        if (n <= 0) return "no roman for zero or negative";
        if (n > 3999) return "number too large";
        StringBuilder sb = new StringBuilder();        
        for (Map.Entry<Integer, String> entry : romans.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
           while (n >= value) {
                sb.append(symbol);
                n -= value;
            }
        }
        
        return sb.toString();
    }
}