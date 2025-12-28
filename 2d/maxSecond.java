import java.util.Arrays;
public class maxSecond
{
    public static void main(String[] args)
    {
        int n=3;
        int a[][]={
            {5,9,4},
            {2,5,8},
            {3,6,9}
                  };
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            Arrays.sort(a[i]);
        }
        System.out.println(max);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }

    }
}