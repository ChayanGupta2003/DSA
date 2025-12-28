import java.util.ArrayList;
public class arrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> studentName=new ArrayList<>();
        studentName.add("Mohan");  
        studentName.add("Max");
        studentName.add("Rakesh");
        studentName.add("Yuva ");
        System.out.println(studentName);
        
        ArrayList<Object> radiusName=new ArrayList<>();
        radiusName.add(new Circle(30));  
        radiusName.add(new Circle(50));
        radiusName.add(new Circle(10));
        radiusName.add(new Circle(20));
        System.out.println(radiusName);
        radiusName.add(1,new Circle(100));   
        System.out.println(radiusName);
       
        ArrayList<Rectangle> rec=new ArrayList<>();
       rec.add(new Rectangle(10,20));
       rec.add(new Rectangle(30,40));
       rec.add(new Rectangle(40,50));
       System.out.println(rec);
       
       ArrayList<Circle> cir=new ArrayList<>();
       cir.add(new Circle(30));  
       cir.add(new Circle(50));
       cir.add(new Circle(10));
       System.out.println(cir);
       /*
       ArrayList<Object> shape=new ArrayList<>();
       shape.addAll(rec);
       shape.addAll(cir);
       System.out.println(shape.get(4));
       
       ArrayList<Integer> list;
       list=new ArrayList();
       list.add(2);list.add(4);list.add(6);list.add(8);list.add(10);
       System.out.println(list);
       ArrayList<Integer> list1;
       list1=new ArrayList();
       list1.add(20);list1.add(40);list1.add(60);list1.add(80);list1.add(100);
       
       //list.add(list1); compile error
       list.addAll(list1);
       System.out.println(list);
       
       clear() method clears the arrayList and isEmpty() returns false if it is empty
       contains() method checks if a particular value is present or not
       a.contains('A');
        */
    }
}
class Circle
{
    int radius;
    Circle(int r)
    {
        this.radius=r;
    }
    public String toString()
    {
        return "Circle[radius = "+radius+"]";
    }
}
class Rectangle
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;this.b=b;
    }
    public String toString()
    {
        return "Rectangle[area = "+l+"]";
    }
}