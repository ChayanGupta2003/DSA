package stringprograms;


public class stringNumAdd
{
    public static void main(String[] args)
    {
        int sum=0;
        String s="b11a24n31a43n51a".toLowerCase().trim();
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)>='0' && s.charAt(i) <='9')
             sum+=(s.charAt(i)-'0');
        }
        System.out.println(s+"\n Sum is "+ sum);
    }
}