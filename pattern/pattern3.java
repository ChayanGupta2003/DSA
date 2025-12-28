public class pattern3
{
    public static void main(String args[])
    {
        int n=5,k=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+"  ");
                    //System.out.print("{"+k+"}  j is "+j+" ");
                    //k++;
                   k--;
                }
                k+=i+1;
                //System.out.print("k is "+k+" and i:"+i);
                
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+"  ");
//                    System.out.print("{"+k+"}  j is "+j+" ");
                    k++;
                }
               k+=i;
               // System.out.print("k is "+k+" and i:"+i);
            }
            System.out.println();
        }
    }
}