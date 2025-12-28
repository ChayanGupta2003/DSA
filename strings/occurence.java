import java.util.*;
public class occurence
{

    public static void main(String[] args)
    {
        String s="banana";
        Map<Integer,Character> m = new HashMap<Integer,Character>();
        for(int i=0;i<s.length();i++)
        {
            m.put(i,s.toLowerCase().charAt(i));
        }
        for(Map.Entry<Integer,Character> entry:m.entrySet())
        {
            char c=entry.getValue();
            System.out.print(c+" = ");
            if(m.containsValue(c))
            {
                System.out.println(m.containsValue(c));
            }
        }
        for(Map.Entry<Integer,Character> entry:m.entrySet())
        {
           System.out.println(entry.getKey()+" : "+ entry.getValue()); 
        }

    }
}
/*
    m
    
    b 0
    a 1
    n 2
    a 3
    n 4
    a 5
*/