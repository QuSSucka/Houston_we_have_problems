package generic;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        String man1 = "Serg";
        String man2 = "Bob";
        String man3 = "Alice";
        String man4 = "Boblee";

        LinkedList<String> linkedList1 = new LinkedList<String>(); // Быстрее чем Arraylist (с помощью ссылок)
        linkedList1.add(man1);
        linkedList1.add(man2);
        linkedList1.add(man3);
        linkedList1.add(man4);
        System.out.println(linkedList1);
    }
}
