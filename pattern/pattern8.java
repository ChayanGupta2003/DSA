public class pattern8
{
    public static void main(String[] args)
    {
        int n=11;
        int r=0;
        int c=n;
        char dir='w';
        int a[][]=new int[n][n];
        for(int k=1;k<=n*n;k++)
        {
            switch(dir)
            {
                case 'w':
                    a[r][--c]=k;
                    if(c==r)
                    {
                        dir='s';
                    }
                    break;
                case 's':
                    a[++r][c]=k;
                    if(r+c==n-1)
                    {
                        dir='e';
                    }
                    break;
                case 'e':
                    a[r][++c]=k;
                    if(r==c)
                    {
                        dir='n';
                    }
                    break;
                case 'n':
                    a[--r][c]=k;
                    if(r+c==n)
                    {
                        dir='w';
                    }
                    break;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)
                System.out.print(a[i][j]+ "  ");
                else
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}