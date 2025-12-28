public class pattern9
{
    public static void main(String[] args)
    {
        int n=5;
        char dir='n';
        int r=n-1;
        int c=0;
        int[][] a=new int[n][n];
        for(int k=1;k<=n*n;k++)
        {
            switch(dir)
            {
                case 'n':
                    a[r--][c]=k;
                    if(r-1==c)
                    {
                        
                    }
                    break;
            }
        }
    }
}