public class MyStackLL
{
    private Node first;
    private Node last;
    int pointer;
    void add(Object e)
    {
        Node current=new Node(e,null);
        pointer++;
        if(first==null)
        { 
            first=current;
            last=current;
        }
        else
        {
            last.next=current;
            last = current;
        }
    }
    void show()
    {
        System.out.println("first Node: "+first);
        System.out.println("last: "+last);
        System.out.println("pointer: "+pointer);
    }
    void display()
    {
        Node current=first;
        for(int i=pointer;i>0;i--)
        {
            System.out.println("[ "+current.e+" ]\t"+pointer);
            current=current.next;
        }
        System.out.println();
    } 
    
    /*
     first = 
     last = 
     */
}