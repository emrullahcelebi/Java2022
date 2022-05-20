package day13;

import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(8);

        System.out.println(list);//[10, 5, 3, 8]

        int karelerinToplami=0;
        for (Integer each: list
             ) {
            karelerinToplami+=each*each;

        }
        System.out.println(karelerinToplami);//198
    }
}
