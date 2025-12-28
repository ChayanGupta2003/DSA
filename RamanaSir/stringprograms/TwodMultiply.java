package stringprograms;
import java.util.Scanner;


public class TwodMultiply
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int m1=sc.nextInt();
    int n1=sc.nextInt();
    int[][] a=new int[m1][n1];
    System.out.println("add elements for matrix "+m1+" * "+n1);
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n1;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    
    int m2=sc.nextInt();
    int n2=sc.nextInt();    
    int[][] b=new int[m2][n2];
    System.out.println("add elements for matrix "+m2+" * "+n2);
    for(int i=0;i<m2;i++)
    {
        for(int j=0;j<n2;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Starting Array Multiplication");
    int sum=0;
    int[][] result=new int[m1][n2];
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            for(int k=0;k<n2;k++)
            {
            result[i][j]+=(a[i][k]*b[k][j]);
        }
        }
    }

    
    System.out.println();
    }
    
    
    /*
        2 x 2      2  x 3
        1   2      5    6   7
        00  01     00   01  02
        
        3   4      7    8   9
        10  11     10   11  12       
                   
            
        2 x 3
        
        
        00   01  02
        
        
        10   11  12
    */
}