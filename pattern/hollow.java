public class hollow
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
                for(int j=i;j<n;j++)
                    System.out.print("  ");
                for(int j=1;j<=i;j++)
                {
                    if((j==1)||(i==n))
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<i;j++)
                {
                    if(i==1)
                    continue;
                    else if((i==n)||((i-j)==1))
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            System.out.println();
        }
        
    }
    
    /*
        1  2  3  4
     1           *  
     2        *     *
     3     *           *
     4  *  *  *  *  *  *  * 
     */
}
