import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt(); // Ввод чего-то с клавиатуры, для этого импортируется (import java.util.Scanner)
        System.out.println(i);
        System.out.println("____________________Перевод из одного типа в другой___________________");
        int i1 = 112312;
        String s1 = "123888";
        int i2 = Integer.parseInt(s1); // Переводит из строки в число(целое)
        System.out.println(i1 + i2);
        String s2 = String.valueOf(i1); // Переводит из любого типа в строку
        System.out.println(s1+s2);
        char c1 = s1.charAt(0); // Записывает в чар знак(букву) под индексом
        double d1 = Double.parseDouble(s1); // Переводит в тип дабл
        System.out.println(c1+d1);
    }
}
