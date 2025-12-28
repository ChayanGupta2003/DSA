import myCollection.chayancollection.*;
public class test
{
    public static void main(String args[])
    {
        Box<Integer> b=new SmallBox<Integer>();
        System.out.println(b.getRowPointer());
        System.out.println(b.getColumnPointer());
        b.add(10);
        b.add(20);
        b.add(30);
        b.add(40);
        b.add(50);
        b.add(60);
        b.add(70);
        b.add(80);
        b.add(90);
        b.add(100);
        System.out.println(b);
    }

}