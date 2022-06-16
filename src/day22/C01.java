package day22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {


        List<String> liste=new ArrayList<>();
liste.add("X");
liste.add("Y");


        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("A");
        ll1.add("B");

        System.out.println(ll1);
        ll1.add(1,"C");
        System.out.println(ll1);
        ll1.addAll(liste);
        System.out.println(ll1);
        ll1.addAll(2,liste);
        System.out.println(ll1);
        ll1.addLast("F");
        System.out.println(ll1);

    }
}
