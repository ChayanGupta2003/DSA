package stringprograms;

import java.util.Arrays;
public class stringToarray
{
    public static void main(String[] args)
    {
    String s="banana";
    char[]c=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
        c[i]=s.charAt(i);
    }
    System.out.println(c.toString());
    }
}