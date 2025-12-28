public class hollow1
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
                System.out.print("  ");
            for(int j=i;j<=n;j++)
            {
                if((j>i)&&(i>1))
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(int j=i;j<n;j++)
            {
                if((j<(n-1)&&(i>1)))
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
       1 2 3 4 5
       1 2 3  1 2
       * * *| * * 1
       _ * _| * _ 2
       _ _ *|_ _ 3 = n
       
     
     */
}
