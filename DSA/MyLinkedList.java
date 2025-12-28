
public class MyLinkedList
{
    Node first;
    Node last;
    int pointer=0;
    
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
        for(int i=0;i<pointer;i++)
        {
            System.out.print("[ "+current.e+" | "+current.next+" ]\t");
            current=current.next;
        }
        System.out.println();
    } 
}

/*
 first = ( )
 last =( )
 
 current=(10,null);
 */