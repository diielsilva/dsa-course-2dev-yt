package datastructures.lists.singly;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        System.out.println(list.getHead().value);
        System.out.println(list.getHead().next.value);
        System.out.println(list.getHead().next.next.value);

        list.reverse();

        System.out.println(list.getHead().value);
        System.out.println(list.getHead().next.value);
        System.out.println(list.getHead().next.next.value);
    }
}
