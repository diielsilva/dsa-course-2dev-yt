package datastructures.stack;

public class CustomStack {

    private StackNode top;
    private int length;

    public void push(int value) {
        StackNode node = new StackNode(value);

        if(isEmpty()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        length++;
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
