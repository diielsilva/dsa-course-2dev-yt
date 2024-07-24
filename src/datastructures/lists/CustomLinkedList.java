package datastructures.lists;

import java.util.List;

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

    public ListNode removeAtStart() {
        if(isEmpty()) {
            return null;
        }

        if(size == 1) {
            ListNode aux = head;
            head = head.next;
            aux.next = null;
            tail = null;
            size--;
            return aux;
        }

        ListNode aux = head;
        head = head.next;
        aux.next = null;
        size--;
        return aux;
    }

    public ListNode removeAtEnd() {
        if(isEmpty()) {
            return null;
        }

        if(size == 1) {
            ListNode aux = tail;
            head = null;
            tail = null;
            size--;
            return aux;
        }

        ListNode previous = get(size - 2);
        ListNode aux = tail;
        previous.next = null;
        tail = previous;
        size--;
        return aux;
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
