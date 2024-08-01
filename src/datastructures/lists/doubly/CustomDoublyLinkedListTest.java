package datastructures.lists.doubly;

public class CustomDoublyLinkedListTest {

    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();

        list.addAtEnd(10);

        System.out.println(list.getHead().value);
        System.out.println(list.getTail().value);
        System.out.println(list.getSize());

        list.addAtEnd(20);
        list.addAtEnd(30);

        System.out.println(list.getHead().value);
        System.out.println(list.getTail().value);
        System.out.println(list.getSize());
    }
}
