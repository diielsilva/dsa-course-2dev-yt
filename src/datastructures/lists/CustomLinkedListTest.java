package datastructures.lists;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);

        list.add(2, 30);
        list.add(1, 15);

        System.out.println(list.get(1).value);
        System.out.println(list.get(3).value);

        System.out.println(list.getSize());
    }
}
