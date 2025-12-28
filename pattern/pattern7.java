
public class pattern7
{
    public static void main(String[] args)
    {
        int r=0,c=0,n=5;
        char dir='e';
        int[][] a=new int[n][n];
        for(int k=1;k<=n*n;k++)
        {
            switch(dir)
            {
                case 'e':
                    a[r][c]=k;
                    c++;
                    if(c==n-r)
                    {
                        dir='s';
                        --c;
                        ++r;
                        System.out.println(r+" "+c);
                    }
                    break;
                    
                case 's':
                    a[r][c]=k;
                    r++;
                    if(r>c)
                    {
                        dir='w';
                        --c;
                        --r;
                        System.out.println(r+" "+c);
                    }
                    break;
                case 'w':
                    a[r][c]=k;
                    c--;
                    if(r+c==n-2)
                    {
                        dir='n';
                        ++c;
                        --r;
                        System.out.println(r+" "+c);
                    }
                    break;
                case 'n':
                    a[r][c]=k;
                    r--;
                    if(r==c)
                    {
                        dir='e';
                        ++c;
                        ++r;
                        System.out.println(r+" "+c);                        
                    }
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");   
            }
            System.out.println("\n");
        }
    }
    /*
     1  2   3   4   5
     16 17  18  19  6
     15 24  25  20  7
     14  23 22  21  8
     13 12  11  10  9
    e
         r=0
         c=n-r
         
         r=1
         c=n-r
     
     
     s
         r= 5  (n)
         c= 4 (n-1)
         
         r=4  (n-1)
         c=3   (n-1)-1
     
     w
         r=4 n-1
         c=-1
         
         r=3 n-2
         c=0
         
         r+c==n-2
         
     n
         r=0
         c=0
         
         r=1
         c=1

     00 01 02 03 04
     10 11 12 13 14
     20 21 22 23 24
     30 31 32 33 34
     40 41 42 43 44
     */
}