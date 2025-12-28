public class MyQueue {
    private MyArrayList list = new MyArrayList();

    public void enqueue(Object e) {
        list.add(e);
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow: Cannot dequeue from an empty queue");
        }
        return list.remove(0);
    }
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.get(0);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}