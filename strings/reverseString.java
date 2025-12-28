public class reverseString
{
    public static String recursiveString(String s)
    {
        if(s.isEmpty())
        return s;
        else
        return recursiveString(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args)
    {
    String s="data structure";
    String s1= recursiveString(s);
    s=s+" ";
    System.out.println(s1);
    int i=0,j=0;
    while(j<s.length())
    {
        if(s.charAt(j)==' ')
        {
        System.out.print(s.substring(i,j));
        i=j;
        }
        j++;
    }

    }
    /*
     d a t a   s t r u c t  u  r  e     l
     0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
     */
}