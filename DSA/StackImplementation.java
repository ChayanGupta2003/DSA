import java.util.Scanner;
public class StackImplementation
{
    public static void main(String[] args)
    {
    Scanner x=new Scanner(System.in);
    boolean state=true;
    MyStack s=new MyStack();
    while(state)
    {
        System.out.println("\n1.push\t2.pop\t3.peek\t4.display\t5.exit");
        int choice = x.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter element to add: \n");
                int data=x.nextInt();
                s.push(data);
                break;
            case 2:
                System.out.println("Element "+ s.pop() +" popped from Stack\n");
                break;
            case 3:
                s.peek();
                break;
            case 4:
                s.display();
                break;
            case 5:
                state=false;
                break;
            default:
                throw new IllegalStateException("Wrong Input");
        }
    }
    }
}