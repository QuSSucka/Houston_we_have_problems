package generic;

import java.util.ArrayList;

public class _ArrayList_ {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(3, 2);
        System.out.println(list1);
        list1.set(4, 1);
        list1.set(4, 1231); // Заменяет по индексу на другое значение
        System.out.println(list1);
        System.out.println(list1.get(4));
        System.out.println(list1.remove(4)); // Если да то вывести и удалить. Если нет то фолс
        System.out.println(list1);
        System.out.println("-------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1); // Добавить все элементы list2.addAll(3, list1) и в какую ячейку
        System.out.println(list2);
        list2.clear(); // Очищает лист
        System.out.println(list2);
        System.out.println(list2.size()); // Размер листа
        System.out.println(list1.indexOf(2)); // Ищет с начала
        System.out.println(list1.lastIndexOf(2)); // Ищет с конца
        System.out.println(list2.isEmpty()); // Пустой или заполненый булеан
        System.out.println(list1.contains(1)); // Возвращает булеан есть или нет элемент в массиве
        System.out.println("----------------------");
        ArrayList<Integer> list3 = new ArrayList<>(list1);
        System.out.println(list3);
    }
}
