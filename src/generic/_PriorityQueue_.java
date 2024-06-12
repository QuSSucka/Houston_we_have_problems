package generic;

import java.util.PriorityQueue;


public class _PriorityQueue_ {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(); // Багованный не юзать
        q.add(1);
        q.add(23);
        q.add(4);
        q.add(5);
        q.add(6);

//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.remove());
        System.out.println(q);
//        for (Integer i : q) {
//            System.out.println(i);
//        }
        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.poll());
        }
        System.out.println(q);
    }
}
