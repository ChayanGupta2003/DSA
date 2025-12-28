import java.util.*;

class Stack
{
    private ArrayList<Object> stack = new ArrayList<>();

    public void push(Object input)
    {
        stack.add(input);
        System.out.println(input + " went inside stack");
    }

    public Object pop()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack Empty");
            return null;
        }

        Object delete = stack.remove(stack.size() - 1);
        System.out.println("Element Deleted: " + delete);
        return delete;
    }

    public void peek()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack empty");
            return;
        }

        for(int index = stack.size() - 1; index >= 0; index--)
        {
            System.out.println("| " + stack.get(index) + " |");
            System.out.println("______");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        boolean state = true;
        Stack stack=new Stack();
        while(state)
        {
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Exit");
            x = sc.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Enter Element: ");
                    String input = sc.nextLine();
                    stack.push(input);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    state = false; 
                    break;
            }
        }
    }
}
