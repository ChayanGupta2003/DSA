public class hollow2
{
    public static void main(String args[])
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

    /*
     1 2 3 4 5
     * * * * * 1
     *       * 2 
     *       * 3
     *       * 4
     * * * * * 5
     */    
