package day23;

import java.util.HashSet;
import java.util.Set;

public class C01 {
    public static void main(String[] args) {
         Set<String> set1=new HashSet<>();
         set1.add("B");
         set1.add("A");
         set1.add("B");
         set1.add("C");
         set1.add("B");
         set1.add("A");

        System.out.println(set1);
        System.out.println(set1.hashCode());
        
        set1.add("M");
        set1.add("E");
        System.out.println(set1);
        System.out.println(set1.hashCode());

    }
}
