public class pattern1
{
static int k=1;
 public static int[] swap(int[] a)
 {
     int i=0,j=a.length-1;
     while(i<j)
     {
         int temp=a[j];
         a[j]=a[i];
         a[i]=temp;
         i++;j--;
     }
     return a;
 }
 public static void main(String[] args)
 {
     int n=5;
     for(int i=1;i<=n;i++)
     {
           if(i%2==0)
           {
             int a[]=new int[i];
             for(int j=0;j<i;j++)
             {
             a[j]=k;
             k++;
            }
             swap(a);
             for(int j=0;j<i;j++)
             {
             System.out.print(a[j]+"  ");
            }
            
           }
           else
           {
              for(int j=1;j<=i;j++)
              {
              System.out.print(k+"  "); 
            
              k++;
            }  
           }
             System.out.println();  
         }
         
     }
}

/*
 n=5
 a = [   ]
      0 1
   j= 1 2  i(2)
   k= 2 3

 a = [       ]
      0 1 2 3
   j= 1 2 3 4 i(4)
   k= 7 8 9 10
      
 1 2 3 4
 1       1   0
 3 2     2   0 1
 4 5 6   3   1 2 3
10 9 8 7 4   3 4 5 6
 
 */