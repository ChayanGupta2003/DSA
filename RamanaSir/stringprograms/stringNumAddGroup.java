package stringprograms;



public class stringNumAddGroup
{
    public static void main(String[] args)
    {
    int sum=0,tempSum=0;
    String s="b11a24*<n313a463)()(n51a".toLowerCase().trim();
   // String s="b123c12";
    s=s+" ";
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(c>='0'&&c<='9')
        {
            tempSum=tempSum*10+(c-'0');
        }
        else
        {
            sum+=tempSum;
            tempSum=0;
        }
        
    }
    System.out.println(sum);
    }
}