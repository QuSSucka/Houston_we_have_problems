import java.util.Arrays;

public class Stringe {
    public static void main(String[] args) {
        String st_1 = "Hello World";
        System.out.println(st_1); // Строка это не массив, мы можем изменить всю строку, но переписать 1 из элементов мы не можем

        for (int i = 0; i < st_1.length(); i++) {
            System.out.print(st_1.charAt(i)); // charAt() чтобы обратиться к каждому элементу в строке
        }
        System.out.println("---------------");
        char[] str_2 = st_1.toCharArray(); // Переводит из строки в массив
        System.out.println(Arrays.toString(str_2));
        for (int i = 0; i < str_2.length; i++) {
            System.out.print(str_2[i]);
        }
        System.out.println();
        System.out.println("******************");
        for (char c : str_2) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("---------------");
        String str_1 = "Hello World";
        System.out.println(str_1);
        System.out.println(str_1.length()); // Длина строки
        System.out.println(str_1.charAt(4));// Вывести элемент строки
        String s1 = "Hello World";
        System.out.println(s1.contains("e")); // Найти букву в слове. Результат вывода true or false
        System.out.println(s1.indexOf("l")); // Ищет сначала
        System.out.println(s1.lastIndexOf("l")); // Можно искать целую строку. Ищет с конца
        System.out.println(s1.startsWith(" llo")); // Проверка с чего начинается строка
        System.out.println(s1.endsWith("ld")); // Проверка на что заканчивается
        System.out.println(s1.isEmpty()); // Проверка строки на пустоту
        System.out.println(s1.isBlank()); // Проверка на пустоту, пробел тоде не считается
        System.out.println(s1.toUpperCase()); // Все в верхний регистр. Начальная строка не меняется
        System.out.println(s1.toLowerCase()); // Все в нижний регистр. Начальная строка не меняется
        System.out.println("-------------------------------------");
        System.out.println(s1);
        System.out.println(s1.repeat(2)); // Повторить несколько раз
        System.out.println(s1.replace("e", "1231233"));
        System.out.println(s1);
        System.out.println(s1.substring(0, 4)); // 4 не включительно
        System.out.println(Arrays.toString(s1.split("l"))); // Символ который указывается как разделитель - вырезается
        String s2 = "123456789";
        System.out.println(s2.length());
        System.out.println("---------------");
        for (int i = s2.length() - 1; i >= 0; i--) {
            System.out.print(s2.charAt(i));
        }
        System.out.println();
        if (s1.equals(s2)) { // Для сравнения строк
            System.out.println("==");
        } else {
            System.out.println("<>");
        }
        System.out.println("---------------");
        String s_1 = "1";
        String s_2 = "2";
        if (s_1.compareTo(s_2) == 0) { // Сравниваются только первые символы по таблице Аски
            System.out.println(">");
        } else {
            System.out.println("<");
        }
        System.out.println("---------------");
        StringBuilder sro_1 = new StringBuilder();
        System.out.println(sro_1);
        sro_1.append("Hello ");
        System.out.println(sro_1);
        sro_1.append("world");
        System.out.println(sro_1);
        sro_1.delete(6, 9); // 6-8
        System.out.println(sro_1);
        sro_1.setLength(2); // Устанавливает длину StringBuilder
        System.out.println(sro_1);
        sro_1.deleteCharAt(1);
        System.out.println(sro_1);
        System.out.println("---------------");

        String s = "Hello world!";
        StringBuilder sb_1 = new StringBuilder();
        StringBuilder sb_2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb_1.append(s.charAt(i));
        }
        System.out.println(sb_1);
        for (int i = 0; i <= s.length() -1; i++) {
            sb_2.insert(0,s.charAt(i));
        }
        System.out.println(sb_2);
    }
}
