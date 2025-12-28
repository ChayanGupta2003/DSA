
/*
 pre defined class
 inherit from List interface
 present in java.util package
 introduced in 1.0 (legacy class)
 ---------------------------------
 duplicated allowed
 null allowed
 Insertion order maintained
 Hetereogenous allowed
 index based
 Initial capacity is 10
 Incremental Capacity= Current Capacity*2;
 ------------------------------------------
 
 */
import java.util.Vector;
public class vector
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(10);
        System.out.println(v);
    }
}