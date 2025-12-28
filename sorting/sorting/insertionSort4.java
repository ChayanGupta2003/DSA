import java.util.Arrays;
public class insertionSort4 {
    public static void main(String[] args) {
        Object a[] = {42, 4, 6, 3, 5, 7, 3, 2, 9};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            Object key = a[i];               
            Comparable ck = (Comparable) key;
            int j = i - 1;
            while (j >= 0 && ck.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;     
        }
        System.out.println(Arrays.toString(a));
    }
}
/*

    42  4   6   3   5   7   3   2   9   
    0   1   2   3   4   5   6   7   8
        i                           i
    j
        key =42
    
    
 
 */
