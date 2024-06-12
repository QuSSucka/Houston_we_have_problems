package generic;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>(); // Словарь
        map1.put(null, null);
        map1.put("1", "123");
        map1.put("2", "456");
        map1.put("3", "789");
        map1.putIfAbsent("key2", "value2"); // Чтобы не ошибиться и случайно не перезаписать ключ который был до этого
        System.out.println(map1);
        System.out.println(map1.get("key1"));
        map1.remove("key2");
        System.out.println(map1);
        System.out.println(map1.containsKey("key2")); // Выводит булеан
        System.out.println(map1.containsValue("value2"));
        System.out.println(map1.isEmpty());
        System.out.println(map1.keySet()); // В списке выводит
        System.out.println(map1.values()); // В списке выводит
        System.out.println(map1.entrySet()); // В списке выводит
        System.out.println(map1);


    }
}
