public class MyLinkedList
{
    private Node first=null;
    private Node last=null;
    int pointer=0;
    void add(Object data)
    {
        Node n=new Node(data,null);
        System.out.println("newNode= "+n);
        if(first==null)
        {
            first=n;
            last=n;
            return;
        }
        pointer++;
        last.next=n;
        last = n;
    }
    void add(Object data,int index)
    {
        if(index<-1 || index>size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node n=new Node(data,null);
        System.out.println("newNode= "+n);
        if(index==0)
        {
            if(first==null)
            {
                first=n;last=first;return;
            }
            Node temp=first;
            first=n;
            first.next=temp; 
        }
        else if(index==pointer)
        {
            Node current=first;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=n;
            last=n;
        }
        else
        {
            Node current=first;
            for(int i=0;i<index;i++)
            {
                current=current.next;
            }
            Node temp=current.next;
            current.next=n;
            current.next.next=temp;
        }
        pointer++;
    }
    int size()
    {
        return pointer+1;
    }
    boolean isEmpty()
    {
        if(first==null)
        return true;
        
        return false;
    }
    void show()
    {
        System.out.println("first= "+first);
        System.out.println("last= "+last);
    }
    @Override
    public String toString()
    {
        String s="";
        Node current=first;
        for(int i=0;i<=pointer;i++)
        {
            s+="[ "+current.data+ " ]";
            if(i!=pointer)
            s+="->";
            current=current.next;
        }
        return s;
    }
}