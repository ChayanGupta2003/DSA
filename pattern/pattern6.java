public class pattern6
{
    public static void main(String[] args)
    {
        int n=4;
        int jc=n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<jc+1;j++)
            {
                if(j<n-i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
            ++jc;
        }
        System.out.println();
    }
}
/*
``n=4
  jn=4
  i=0
  j=0 1 2 3 4
            *
  jn=6
  i=1
  j=0 1 2 3 4 5
          * * *  

           
*/