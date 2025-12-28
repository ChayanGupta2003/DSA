import java.util.ArrayList;
public class arrayNum
{
    public static void main(String args[])
    {
        int[] a={10,2,12,0,13,1};
        //int[] a={6,9,5,12,6,8,9,4};
        int i=0,k=0;
        int flag=0;
        ArrayList x=new ArrayList();
        while(true)
        {
            if(a[i]<=a[k])
            {
                x.add(a[k]);
                flag++;
                if(flag==3)
                {
                    System.out.println(x);
                }
            }
            k++;
            if(k==a.length)
            {
                if(i==a.length-2)
                {
                    break;
                }
                i++;
                k=i;
                flag=0;
                x.clear();
            }
        }
    }
}