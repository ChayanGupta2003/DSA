import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arrayList1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList();
        Iterator<Integer> it=list.iterator();
        for(int i=0;i<10;i++)
        {
            System.out.println("Add element: "+(i+1));            
            list.add(sc.nextInt());
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Element"+list.get(i));            
        }

    }
}