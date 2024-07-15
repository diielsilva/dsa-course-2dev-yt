package datastructures.stack;

public class CustomStackTest {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        StackNode node = stack.pop();

        System.out.println(node.value);

        node = stack.pop();

        System.out.println(node.value);

        node = stack.pop();

        System.out.println(node.value);

        System.out.println(stack.getLength());

    }

}
