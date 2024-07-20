package datastructures.lists;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addAtStart(10);
        list.addAtStart(20);
        list.addAtStart(30);

        System.out.println(list.getTail().value);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
    }
}
