package stringprograms;
public class palindromeString
{
    public static void main(String[] args)
    {
    String s="masas".toLowerCase().trim();
    char[] c=s.toCharArray();
    
    int i=0,j=c.length-1;
    while(i<j)
    {
        if(c[i]!=c[j])
        {
            System.out.println(new String(c)+" is not palindrome");
            return;
        }
        i++;
        j--;
    }
    System.out.println(new String(c)+" is palindrome");
    }
}