package generic;

public class _StringBuilder_ {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Hello");
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder(10); // capacity сколько выделяется памяти под объекты
    }
}
