import java.util.Arrays;
public class insertionSort
{
    public static void main(String[] args)
    {
        int a[]={67,10,34,2,78,3,44,5,23,77,5,3};
        System.out.println(Arrays.toString(a));
        int i=1;
        while(i<a.length)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            i++;
        }
        
        System.out.println(Arrays.toString(a));
        
        /*
        67  10  34  2   78  3   44  5   23  77  5   3
        0   1   2   3   4   5   6   7   8   9   10  11
        
        key=34
        10  67  34  2   78  3   44  5   23  77  5   3
        0   1   2   3   4   5   6   7   8   9   10  11
        */
    }

}