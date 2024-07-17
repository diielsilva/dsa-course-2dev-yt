package datastructures.queues;

public class CustomQueueTest {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        System.out.println(queue.getLength());

        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println(queue.getFirst().value);
        System.out.println(queue.getLast().value);

        System.out.println(queue.getLength());
    }
}
