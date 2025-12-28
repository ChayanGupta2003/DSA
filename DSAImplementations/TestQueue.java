public class TestQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        System.out.println("Enqueueing: 10, 20, 30");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Current Queue: " + q);
        System.out.println("Front element (peek): " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Queue after dequeue: " + q);

        q.enqueue(40);
        System.out.println("After enqueue(40): " + q);
        
        System.out.println("Final Size: " + q.size());
    }
}