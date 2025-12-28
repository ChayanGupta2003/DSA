package stringprograms;

import java.util.*;

public class stringFrequency
{
    public static void main(String[] args)
    {
    String s="banana";
    System.out.println(s);
    Map<Character,Integer> list=new HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        int c;
        if(!(list.containsKey(ch)))
        {
            c=0;
            list.put(ch,c+1);
        }
        else
        {
            list.get(ch);
            list.put(ch,list.get(ch)+1);
        }
    }
        System.out.println(list);
    }
}
    /*
     b a n a n a
     0 1 2 3 4 5
     */