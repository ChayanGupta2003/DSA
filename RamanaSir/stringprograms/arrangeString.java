package stringprograms;
public class arrangeString
{
    public static void main(String[] args)
    {
        String s="xy12$T58u13";
        String digits="";
        String alpha="";
        String special="";
        //int num;char special;char alphabet;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                digits+=s.charAt(i);
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                alpha+=s.charAt(i);            
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                alpha+=s.charAt(i);
            }
            else
            {
                special+=s.charAt(i);                
            }
        }
        System.out.print(digits+""+special+""+alpha);
    }
}