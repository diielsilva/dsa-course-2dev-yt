package datastructures.stack;

public class CustomStackTest {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        System.out.println(stack.getLength());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.getTop().value);
        System.out.println(stack.getLength());

    }

}
