package datastructures.queues;

public class CustomQueue {
    private QueueNode first;
    private QueueNode last;
    private int length;

    public void enqueue(int value) {
        QueueNode node = new QueueNode(value);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        length++;
    }

    public QueueNode dequeue() {
        if(isEmpty()) {
            return null;
        }

        QueueNode aux = first;
        first = first.next;
        aux.next = null;
        length--;

        if(isEmpty()) {
            last = null;
        }

        return aux;
    }

    public QueueNode getFirst() {
        return first;
    }

    public QueueNode getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }
}
