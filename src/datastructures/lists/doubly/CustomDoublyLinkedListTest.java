package datastructures.lists.doubly;

public class CustomDoublyLinkedListTest {

    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        System.out.println(list.get(-1));
        System.out.println(list.get(4));
        System.out.println(list.get(0).value);
        System.out.println(list.get(3).value);
        System.out.println(list.get(2).value);

    }
}
