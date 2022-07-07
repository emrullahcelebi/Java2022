package day25;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01 {
    public static void main(String[] args) {
        Queue<String> k1=new PriorityQueue<>();
        k1.add("C");
        k1.add("M");
        k1.add("A");
        System.out.println(k1);//[A, M, C]

        Queue<String> k2=new LinkedList<>();
        k2.add("C");
        k2.add("M");
        k2.add("A");
        System.out.println(k2);//[C, M, A]

        k2.offer("Z");
        System.out.println(k2);//[C, M, A, Z]
        k1.offer("Z");
        k1.offer("L");
        System.out.println(k1);//[A, L, C, Z, M]

        System.out.println(k2.peek());//C
        System.out.println(k2);

        k2.remove();
        System.out.println(k2);

        k2.remove("A");
        System.out.println(k2);

        k2.poll();
        System.out.println(k2);

    }
}
