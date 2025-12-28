package stringprograms;
import java.util.Collections;
import java.util.ArrayList;
public class countStringArrayList
{
    public static void main(String[] args)
    {
    String s=" write a java program to count words in a string?   ".trim();
    ArrayList<Character> arr=new ArrayList<Character>();
    for(int i=0;i<s.length();i++)
    {
        arr.add(s.charAt(i));
    }
    System.out.println(s+"\nno. of words:"+(Collections.frequency(arr,' ')+1));
    }
}