package stringprograms;


public class countString
{
    public static void main(String[] args)
    {
    String s="   Java is a popular, high-level, object-oriented programming language and computing platform known for its write once, run anywhere capability, allowing code to run on any device with a Java Virtual Machine (JVM). Developed by Sun Microsystems in 1995";
    s=s.trim();
    int i=0,c=0;
    while(i!=s.length())
    {
        if(s.charAt(i)==' ')
        c++;
        i++;
    }
    System.out.println(s+"\nno. of words:"+(c+1));
    }
}
