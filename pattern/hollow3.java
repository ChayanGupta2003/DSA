public class hollow3
{
public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        
        System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
        for (int j = i; j < n; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        
        System.out.println();
    }
}
}
    
    /*
     i 
    { 1 } 1 2 3 4 1 ->            1 
                  *
    { 2 } 2 3 4 1 2 1  ->   1             1
                * * *  
    { 3 } 3 4 1 2 3 1 2 ->   
              * * * * 
    { 4 } 4 1 2 3 4 1 2 3  
            * * * * * * *
    { 5 } 1 2 3 4 5 1 2 3 4
          * * * * * * * * *
___________________________________
    { 1 } 1 1 2 3 4 1 2 3
            * * * * * * *
    { 2 } 1 2 2 3 4 2 3
              * * * * *
    { 3 } 1 2 3 3 4 3
                * * *
    { 4 } 1 2 3 4 *
     */
