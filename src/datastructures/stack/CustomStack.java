package datastructures.stack;

public class CustomStack {

    private StackNode top;
    private int length;

    public void push(int value) {
        StackNode node = new StackNode(value);

        if (isEmpty()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        length++;
    }

    public StackNode pop() {
        if (isEmpty()) {
            return null;
        }

        StackNode aux = top;
        top = top.next;
        aux.next = null;
        length--;

        return aux;
    }

    public StackNode getTop() {
        return top;
    }

    public int getLength() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }

}
