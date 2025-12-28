package stringprograms;
public class reverseString
{
    public static void main(String[] args)
    {
        String s=new String("BANANA");
        char[] c=s.toCharArray();
        int i=0,j=c.length-1;
        while(i<j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(c));
    }
}