public class test1
{
    public static void main(String[] args)
    {
        MyLinkedList l=new MyLinkedList();
        l.add(10,0);
        System.out.println(l);
        l.show();
        System.out.println("____________________________");
        l.add(20);
        System.out.println(l);
        l.show();
        System.out.println("____________________________");
        l.add(5,0);
        System.out.println(l);
        l.show();
        System.out.println("____________________________");
        l.add(40,2);
        System.out.println(l);
        l.show();
        System.out.println("____________________________");
        l.add(25,1);
        System.out.println(l);
        l.show();
        System.out.println("____________________________");
    }
}