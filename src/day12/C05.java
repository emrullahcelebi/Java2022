package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C05 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");

        System.out.println(list);//[Ali, Can, Ayse, Fatma]
        list.set(2,"Kemal");
        System.out.println(list);//[Ali, Can, Kemal, Fatma]
        list.set(0,"Zalim");
        System.out.println(list);//[Zalim, Can, Kemal, Fatma]

        System.out.println(list.contains("Kemal"));//true

        Collections.sort(list);//siralar
        System.out.println(list);//[Can, Fatma, Kemal, Zalim]

    }
}
