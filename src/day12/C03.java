package day12;

import java.util.ArrayList;
import java.util.List;

public class C03 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(8);
        list.add(12);
        list.add(20);

        System.out.println(list);//[10, 15, 8, 12, 20]

        System.out.println(list.size());//5
        list.remove(1);
        System.out.println(list);//[10, 8, 12, 20]
        System.out.println(list.remove(2));//12
        System.out.println(list);//[10, 8, 20]

        List<String> list2=new ArrayList<>();
        list2.add("Ali");
        System.out.println(list2.remove("Hasan"));//false

        System.out.println(list2.remove(0));//Ali

    }
}
