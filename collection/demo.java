import java.util.*;
class Book implements Comparable<Book>
{
    String name;
    String genre;
    int price;

    Book(String name, String genre, int price)
    {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public int compareTo(Book b)
    {
       // Book b=(Book)args;
        return this.price-(b.price);
    }

    @Override
    public String toString()
    {
        return name + " | " + genre + " | " + price;
    }
}







public class demo
{
    static ArrayList<Book> books = new ArrayList<>();

    public static void takeInput()
    {   
        books.add(new Book("Harry Potter", "Fantasy", 500));
        books.add(new Book("Atomic Habits", "Self-Help", 350));
        books.add(new Book("Rich Dad Poor Dad", "Finance", 400));
        books.add(new Book("The Alchemist", "Fiction", 299));
    }

    public static void print()
    {
        for (Book b : books)
        {
            System.out.println(b);
        }
    }

    public static void businessLogic()
    {
        Collections.sort(books);
        System.out.println("\nAfter Sorting (using Comparable):");
        print();
    }

    public static void main(String[] args)
    {
        takeInput();
        System.out.println("Before Sorting:");
        print();
        businessLogic();
    }
}
