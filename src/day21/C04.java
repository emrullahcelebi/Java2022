package day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("day27");
        System.out.println(list);

        for (String each:list) {

            each+="B";
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(list);

        Iterator it1= list.iterator();

        while(it1.hasNext()){
            it1.next();
            //it1.remove();
        }
        System.out.println(list);

        ListIterator li1=list.listIterator();
        while(li1.hasNext()){

            String temp= (String) li1.next();
            li1.set(temp+"B");
        }
        System.out.println(list);
    }
}
