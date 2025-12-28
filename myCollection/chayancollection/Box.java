package chayancollection;
 
public interface Box<T>
{
    int getRowPointer();
    int getColumnPointer();
    void add(T element);
    
    //void print();
    
}

