
/*
predefined class
java.util
inherit from list interface and Queue interface
jdk 1.2
multiple inheritance

duplicate
null values
index based
insertion order maintained
heterogenous
dynamic
data structure - Doubly Linked List
  __________ _____
 |    |     |     |
  __________ _____
   a     b     c                a= previous node address, b = value, c= next node  address
   
*/
import java.util.*;
public class LinkedList
{
    public static void main(String[] args)
    {
        LinkedList a=new LinkedList();
        a.add(10);
        a.add(10);
        a.add(null);
        a.add("Hi");
    }
}