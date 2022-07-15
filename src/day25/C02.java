package day25;

import java.util.Deque;
import java.util.LinkedList;

public class C02 {
    public static void main(String[] args) {
        Deque<String> dk1=new LinkedList<>();
        dk1.addFirst("C");
        dk1.add("M");
        dk1.add("A");
        System.out.println(dk1);
        dk1.addLast("L");
        System.out.println(dk1);
        System.out.println(dk1.getFirst());//C
        System.out.println(dk1.getLast());//L

        System.out.println(dk1.pop());
        System.out.println(dk1);
    }
}
