package datastructures.lists;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        System.out.println(list.remove(1).value);
        System.out.println(list.getSize());

        System.out.println(list.remove(-1));
        System.out.println(list.remove(2));

        System.out.println(list.remove(0).value);
        System.out.println(list.getTail().value);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
    }
}
