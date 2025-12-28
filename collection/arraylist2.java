import java.util.*;

public class arraylist2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> list=new ArrayList<>();
        for(int i=0;i<3;i++)
        {   
            System.out.println("Enter name and price");
            list.add(new Book(sc.next(),sc.nextInt()));
        }
        System.out.println(list);
    }   
}
class Book
{
    String name;
    int price;
    Book(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    public String toString()
    {
        return "Name: " + name + ", price: " + price;
    }

}