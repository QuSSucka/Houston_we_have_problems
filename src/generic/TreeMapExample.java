package generic;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // Словарь, знаечения сортируются по ключу. Ключ не может быть null
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(6, "six");
        treeMap.put(7, "seven");
        treeMap.put(8, "eight");

        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.floorKey(3));
        System.out.println(treeMap.ceilingKey(3));
        System.out.println(treeMap.lowerKey(3));
        System.out.println(treeMap.higherKey(3));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.floorEntry(3));
        System.out.println(treeMap.ceilingEntry(3));
        System.out.println(treeMap.lowerEntry(3));
        System.out.println(treeMap.higherEntry(3));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.tailMap(3));
        System.out.println(treeMap);
    }
}
