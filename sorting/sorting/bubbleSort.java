import java.util.Arrays;
public class bubbleSort
{
    public static void main(String[] args)
    {
    Object a[]={"html","css","c","java","javascript","python","sql","cloud"};
    int n=a.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            Comparable c1=(Comparable)a[j];
            Comparable c2=(Comparable)a[j+1];
            if(c1.compareTo(c2)>0)
            {
                Object temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(a));
    }
}