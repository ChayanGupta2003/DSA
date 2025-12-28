import java.util.*;
public class MapOccurence
{
    public static void main(String[] args)
    {
        Map<Character,String> m= new LinkedHashMap<Character,String>();
        String s= "banana";
        for(int i=0;i>s.length();i++)
        {
            char c=s.charAt(i);
            if(!m.containsKey(c))
            m.put(c,i+"");
            else
            m.put(c,m.get(c)+" , "+i);
        }
        System.out.println(m);
    }
    
}
