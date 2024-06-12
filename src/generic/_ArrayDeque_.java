package generic;

import java.util.ArrayDeque;

public class _ArrayDeque_ {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addFirst(1);
        a.addFirst(2);
        a.addLast(3);
        a.addFirst(4);
        a.addLast(5);
//        a.removeFirst();
//        a.removeLast();
//        a.pollFirst();
//        a.pollLast();
        System.out.println(a);
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        System.out.println(a.peek());
        System.out.println(a);
    }
}
