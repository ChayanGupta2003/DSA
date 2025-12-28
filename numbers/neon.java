public class neon
{
    static int sum=0;
    public static int recursiveNeon(int n)
    {
        if(n==0)
        return 0;
        int digit=n%10;
        return digit+recursiveNeon(n/10);
    }
    public static void main(String[] args)
    {
      int n=9;
      if(n==recursiveNeon(n*n))
      System.out.println(true);
      else
      System.out.println(false);
    }
    /*
     9
     n=81
     n%10=1
     n/10=8  = 
        
                
                    
     */
}