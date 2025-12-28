package stringprograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class countVowel
{
    public static void main(String[] args)
    {
        ArrayList<Character> list=new ArrayList<Character>();
        String s="eldinerotepermite";
        ArrayList<Character> vowels=new ArrayList<Character>();
        vowels.add('a');vowels.add('e');
        vowels.add('i');vowels.add('o');
        vowels.add('u');
        ListIterator itr=list.listIterator();
        int i=0;
        while(itr.hasNext())
        {
            list.add(s.charAt(i));
            i++;
        }
        int c=0;
        for(i=0;i<list.size();i++)
        {
            char ch=s.charAt(i);
            if(vowels.contains(ch))
            {
                c++;
            }
        }
        System.out.println(list);
        System.out.println(c);
    }
}