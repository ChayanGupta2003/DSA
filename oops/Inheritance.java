public class Inheritance
{
        public static void main(String args[])
        {
            System.out.println("C c = new C();");
            C c = new C();
            System.out.println("B b = new B();");
            B b = new B();
            System.out.println("A a = new A();");
            A a = new A();
            System.out.println("A a1 = new B();");
            A a1 = new B();
            System.out.println("A a2 = new VC();");
            A a2 = new C(); 
            System.out.println("B b1= new C();");
            B b1= new C();
        }
}
class A {
    public A() {
        System.out.println("1. A's constructor");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("2. B's constructor");
    }
}

class C extends B {
    public C() {
        // Assume no explicit super() call is made
        System.out.println("3. C's constructor");
    }
}

// What is the output of: new C();