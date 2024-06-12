package generic;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue_ {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        System.out.println(queue);

        queue.remove(); // удаляет 1 элемент
        queue.poll(); // Не вызывает ошибки если элемента уже нет

        System.out.println(queue);

        System.out.println(queue.peek()); // Не вызывает ошибку если элементов нет
        System.out.println(queue.element()); // Вызывает ошибку если элементов нет
        System.out.println(queue);
    }
}
