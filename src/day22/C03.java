package day22;

import java.util.LinkedList;

public class C03 {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("A");
        ll1.add("B");

        System.out.println(ll1);
        System.out.println(ll1.remove(0));
        System.out.println(ll1);
    }
}
