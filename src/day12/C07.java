package day12;

import java.util.ArrayList;
import java.util.List;

public class C07 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);

        List<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(10);

        System.out.println(list1.equals(list2));//false

        list1.clear();
        System.out.println(list1);//[]

    }
}
