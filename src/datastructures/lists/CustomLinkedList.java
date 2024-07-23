package datastructures.lists;

public class CustomLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public void addAtStart(int value) {
        ListNode node = new ListNode(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addAtEnd(int value) {
        ListNode node = new ListNode(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            this.addAtStart(value);
        } else if (index == size) {
            this.addAtEnd(value);
        } else {
            ListNode previous = get(index - 1);
            ListNode node = new ListNode(value);

            node.next = previous.next;
            previous.next = node;
            size++;
        }

    }

    public ListNode get(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }

        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
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
