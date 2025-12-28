class A
{
    static int a1=10;
    static int a2;
    int b1=20;
    int b2;
    public static void m1()
    {
        a1++;
       // b1++;
    }
    public void m2()
    {
        a1++;
        b1++;
    }
}
public class test1
{
    public static void main(String[] args)
    {
    A a;
    a=new A();
    A.m1();
    a.m2();
    System.out.println(a.a1);
    System.out.println(a.b1);
    System.out.println(a.a2);
    System.out.println(a.b2);
    A ax;
    ax=new A();
    A.m1();
    ax.m2();
    System.out.println(ax.a1);
    System.out.println(ax.b1);
    System.out.println(ax.a2);
    System.out.println(ax.b2);

    }
}