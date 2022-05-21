package day14;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);

        degistirFor(list);
        System.out.println(list);
        degistirSet(list);
        System.out.println(list);

    }

    public static void degistirSet(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+3);
        }
        System.out.println("set ile : "+list);//[13, 14, 15]
    }

    public static void degistirFor(List<Integer> list) {
        for (Integer each:list
             ) {
            each+=3;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(list);
    }
}
