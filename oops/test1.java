import java.util.Scanner;
class Circle
{
    double radius;
    Circle(double r)
    {
        this.radius=r;
    }
}
public class test1
{
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        Circle[] a;
        a=new Circle[3];
        int i=0;
        do
        {
         System.out.print("Radius: ");
         double r=sc.nextDouble();
         a[i]=new Circle(r);
         i++;
        }while(i<a.length);
        
        for(Circle c:a)
        {
            System.out.println("Radius: "+c);
        }
    }
}