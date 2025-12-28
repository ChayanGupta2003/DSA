public class reverse_String
{
    static void reverseString(String s)
    {
        s=s.trim();
        char[] c=s.toCharArray();
        int i=0,j=c.length-1;
        while(i<j)
        {
            char temp=c[j];
            c[j]=c[i];
            c[i]=temp;
            i++;j--;
        }
        System.out.println(s + " -> " + new String(c));
    }
    public static void main(String[] args)
    {
    reverseString("hello");
    reverseString("world");
    reverseString("chayan");
    reverseString("java");
    reverseString("programming");
    reverseString("reverse");
    reverseString("string");
    reverseString("madam");
    reverseString("level");
    reverseString("noon");
    reverseString("hello world");
    reverseString("  leading space");
    reverseString("trailing space  ");
    reverseString("multiple   spaces");
    reverseString("a b c d");
    reverseString("hello how are you");
    reverseString("");
    reverseString("a");
    reverseString("Z");
    reverseString(" ");
    reverseString("  ");
    reverseString("12345");
    reverseString("100200300");
    reverseString("987654321");
    reverseString("000111");
    reverseString("a1b2c3");
    reverseString("123abc");
    reverseString("abc123xyz");
    reverseString("A1B2C3D4");
    reverseString("Hello");
    reverseString("ChAyAn");
    reverseString("JavaPROGRAM");
    reverseString("AbCdEfG");
    reverseString("@#$%^&*");
    reverseString("hello@123");
    reverseString("<>?/|}{");
    reverseString("()()()");
    reverseString("###hello###");
    reverseString("aaaaaaaaaa");
    reverseString("aaaaab");
    reverseString("the quick brown fox jumps over the lazy dog");
    reverseString("reverse this entire long sentence to check performance");
    reverseString("palindromeemordnilap");
    }
}