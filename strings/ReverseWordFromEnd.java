import java.util.Arrays;

public class ReverseWordFromEnd {
    
    /**
     * Reverses the order of words in a given string.
     * @param s The input string.
     */
    static void reverseString(String s) {
        // 1. Split the string into an array of words
        // s.trim() removes leading/trailing spaces
        // "\\s+" splits by one or more whitespace characters
        String[] words = s.trim().split("\\s+");
        
        // 2. Use a StringBuilder to efficiently build the new string
        StringBuilder reversedSentence = new StringBuilder();
        
        // 3. Iterate through the array from the end (words.length - 1) to the start (0)
        for (int i = words.length - 1; i >= 0; i--) {
            // Add the word
            reversedSentence.append(words[i]);
            
            // Add a space after the word, unless it is the very first word in the loop (the last word in the original sentence)
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        
        // 4. Output the result
        System.out.println("Original String: \"" + s + "\"");
        System.out.println("Word Array: " + Arrays.toString(words));
        System.out.println("Reversed String: \"" + reversedSentence.toString() + "\"");
    }

    public static void main(String[] args) {
        // The sentence to be reversed
        reverseString("it hurts to see her go away");
    }
}