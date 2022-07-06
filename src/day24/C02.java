package day24;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02 {
    public static void main(String[] args) {
        Set<String> set1=new LinkedHashSet<>();
        set1.add("A");
        set1.add("F");
        set1.add("B");
        System.out.println(set1);

        TreeSet<String> set3=new TreeSet<>(set1);

    }
}
