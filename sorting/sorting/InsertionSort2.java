import java.util.Arrays;
public class InsertionSort2
{
    public static void main(String[] args)
    {
        int a[]={3,56,3,67,2,7,9,45};
        System.out.println(Arrays.toString(a));
        int i=1;
        while(i<a.length)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
}