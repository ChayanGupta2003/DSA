package stringprograms;


public class arrangeStringBuilder
{
    public static void main(String[] args)
    {
    String s = "xy12$T58u13";

StringBuilder digits = new StringBuilder();
StringBuilder special = new StringBuilder();
StringBuilder letters = new StringBuilder();

for (int i = 0; i < s.length(); i++)
{
    char ch = s.charAt(i);

    if (ch >= '0' && ch <= '9')
        digits.append(ch);
    else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        letters.append(ch);
    else
        special.append(ch);
}

StringBuilder result = digits.append(special).append(letters);

    System.out.println(result);
    }
}