package chayancollection;
 
public class SmallBox<T> implements Box<T>
{
    private Object a[][];
    private int RowPointer;
    private int ColumnPointer;
    private int defaultLength=3;
    
    //constructor
    public SmallBox()
    {
        a=new Object[defaultLength][defaultLength];
        RowPointer=a.length-1;
        ColumnPointer=a[0].length-1;
    }
    public int getRowPointer() {
        return RowPointer;
    }

    public int getColumnPointer() {
        return ColumnPointer;
    }

    
    
    //Adding elements
    @Override
    public void add(T element)
    {
        if((RowPointer==0)&&(ColumnPointer==0))
        {
            throw new IllegalStateException("SmallBox is full");
        }
        a[getRowPointer()][getColumnPointer()]=element;
        if(getColumnPointer()==0)
        {
            RowPointer--;
            ColumnPointer=a.length-1;
        }
        else
        {
            ColumnPointer--;
        }
    }
    
    
    //Printing
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Object[] row : a) {
        for (Object element : row) {
            if (element != null) {
                sb.append(element.toString());
            } else {
                sb.append("-");
            }
            sb.append("\t");
        }
        sb.append("\n");
    }
    return sb.toString();
    }

}

/*
 00     01      02      03
 10     11      12      13
 20     21      22      23
 30     31      32      33
 */
