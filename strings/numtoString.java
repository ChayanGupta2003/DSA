import java.util.LinkedHashMap;
import java.util.Map;

public class numtoString
{
    public static void main(String[] args)
    {
        System.out.println(stringify(821731245));   
    }
    static String stringify(int n)
    {
        String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
        int c=1;
        String s="";
        while(n>0)
        {
            int digit=n%10;
            int num=c*digit;
            //ones
            if(c==1)
            {
                s=s+ones[digit];
            }
            //tens
            if(c==10)
            {
                s=" "+tens[digit]+" "+s;
            }
            //hundreds
            else if(c==100)
            {
                s=" "+ones[digit]+ " hundred" + s;
            }
            //thousands
            else if(c==1000)
            {
                s=" "+ones[digit]+ " thousands" + s;
            }
            //ten thousands
            else if(c==10000)
            {
                s=" "+tens[digit]+ s;                
            }
            //lakhs
            else if(c==100000)
            {
                s=" "+ones[digit]+ " lakhs" + s;
            }
            //ten lakhs
            else if(c==1000000)
            {
                s=" "+tens[digit]+ s;                
            }
            //crore
            else if(c==10000000)
            {
                s=" "+ones[digit]+ " crores" + s;
            }
            //ten crore
            else if(c==100000000)
            {
                s=" "+tens[digit]+ s;                
            }

            c=c*10;
            n=n/10;
        }
        return s;
    }
}