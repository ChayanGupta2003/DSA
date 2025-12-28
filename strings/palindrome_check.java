public class palindrome_check
{
    public static void main(String[] args)
    {
        palindromeCheck("madam");
        palindromeCheck("racecar");
        palindromeCheck("level");
        palindromeCheck("noon");
        palindromeCheck("civic");
        palindromeCheck("radar");
        palindromeCheck("rotor");
        palindromeCheck("refer");
        palindromeCheck("mom");
        palindromeCheck("dada");
        palindromeCheck("hello");
        palindromeCheck("world");
        palindromeCheck("malayalam");
        palindromeCheck("abcba");
        palindromeCheck("abccba");
        palindromeCheck("chayan");
        palindromeCheck("a");
        palindromeCheck("aa");
        palindromeCheck("ab");
        palindromeCheck("aba");
        
    }
    public static void palindromeCheck(String s)
    {
        s=s.toLowerCase().trim();
        char[] c=s.toCharArray();
        int i=0,j=c.length-1;
        int flag=0;
        while(i<j)
        {
            if(s.charAt(j)!=c[i])
                flag=1;
            i++;j--;
        }
        if(flag==0)
            System.out.println(s+" passed");
        else
            System.out.println(s+" failed");
    }
    /*
     
     */
}