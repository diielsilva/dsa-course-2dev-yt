package datastructures.lists;

public class CustomLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public void addAtStart(int value) {
        ListNode node = new ListNode(value);

        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}
