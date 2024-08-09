package datastructures.lists.doubly;

public class CustomDoublyLinkedList {
    private DoublyListNode head;
    private DoublyListNode tail;
    private int size;

    public void addAtStart(int value) {
        DoublyListNode node = new DoublyListNode(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }

        size++;
    }

    public void addAtEnd(int value) {
        DoublyListNode node = new DoublyListNode(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public DoublyListNode get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        if (index < size / 2) {
            DoublyListNode aux = head;

            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }

            return aux;
        } else {
            DoublyListNode aux = tail;

            for (int i = size - 1; i > index; i--) {
                aux = aux.previous;
            }

            return aux;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public DoublyListNode getHead() {
        return head;
    }

    public DoublyListNode getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}
