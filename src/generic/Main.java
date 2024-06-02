package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add(String.valueOf(55));
        list1.add(String.valueOf(false));
        for (String element : list1) {
            System.out.println(element.length());
        }
    }
}
