import java.util.ArrayList;

public class MyStack implements StackUsingArrayList
{
    int pointer=0;
    ArrayList<Object> stack=new ArrayList<Object>();
    public void push(Object e)
    {
        stack.add(e);
        System.out.println("Element "+e+" added to stack");
        pointer++;
    }
    public Object pop()
    {
        if(pointer==0)
        {
            throw new IllegalStateException("Stack Underflow");
        }
        Object deleted=(Integer)stack.remove(--pointer);
        return deleted;
    }
    public void peek()
    {
        if(pointer==0)
        {
            throw new IllegalStateException("Stack Underflow");
        }
        System.out.println("| " + stack.get(pointer-1) + " |"+ " <-pointer " + pointer);
        System.out.println("______");    
    }
    public void display()
    {
        if(pointer==0)
        {
            throw new IllegalStateException("Stack Underflow");
        }
        for(int index = stack.size() - 1; index >= 0; index--)
                {
                    if(index==pointer-1)
                    {
                        System.out.println("| " + stack.get(index) + " |"+ " <-pointer ");
                        System.out.println("______");
                        
                    }
                    else
                    {
                    System.out.println("| " + stack.get(index) + " |");
                    System.out.println("______");
                    }
                }
    }
}