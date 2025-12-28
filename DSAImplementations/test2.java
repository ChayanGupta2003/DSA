public class test2 {
    public static void main(String[] args) {
        MyArrayList x = new MyArrayList();

        System.out.println("Initially empty: " + x.isEmpty());

        for (int i = 10; i <= 100; i += 10) {
            x.add(i);
        }
        
        x.add(110);
        x.add(120);

        System.out.println("Size: " + x.size());
        System.out.println("List: " + x);

        x.add(55, 5);
        System.out.println("After add(55, 5): " + x);

        x.set(5, 555);
        System.out.println("After set(5, 555): " + x);

        Object removed = x.remove(0);
        System.out.println("Removed element: " + removed);
        System.out.println("After removing index 0: " + x);

        System.out.println("Is empty now: " + x.isEmpty());
        
        System.out.print("Internal storage: ");
        x.print();
    }
}