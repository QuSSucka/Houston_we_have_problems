package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Anton");
        al1.add("Bob");
        al1.add("Jack");
        System.out.println(al1);
        Iterator<String> iterator = al1.iterator();
        while (iterator.hasNext()) { // Итераторы работают быстрее чем for
            System.out.println(iterator.next());
        }
    }
}
