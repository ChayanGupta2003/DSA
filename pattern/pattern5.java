import java.util.Arrays;
public class pattern5
{
    public static void main(String[] args)
    {
    int n=5;
    char dir='e';
    int[][]x=new int [n][n];
    int r=0,c=0;
        for(int k=1;k<=n*n;k++)
        {
            switch(dir)
            {
                case 'e':
                    x[r][c++]=k;
//                    System.out.println(r+" "+c);
                    if(r+c==n)
                    {
                        dir='s';
                        --c;
                        ++r;
                    }
                    break;
                case 's':
                    x[r++][c]=k;
                    if(r==c+1)
                    {
                        dir='w';
                        --r;
                        --c;
                    }
                    break;
                case 'w':
                    x[r][c--]=k;
                    if(c<n-r-1)

                    {
                        dir='n';
                        ++c;
                        --r;
                    }
                      break;
                case 'n':
       //                                  System.out.println(r+" "+c);
                      x[r--][c]=k;
         //            System.out.println(r+" "+c);
                      if(r==c)
                      {
                          dir='e';
                          ++r;
                          ++c;
                      }
                    break;
            }
        }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(x[i][j]+"\t");
        }
        System.out.println("\n");
    }

    }
}