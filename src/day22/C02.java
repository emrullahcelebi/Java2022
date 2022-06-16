package day22;

import java.util.LinkedList;

public class C02 {
    public static void main(String[] args) {
        LinkedList<Object> ll1=new LinkedList<>();

        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <1000 ; i++) {
            ll1.add("A"+i);
            ll1.add(20+i);
            ll1.add('C'+i);
        }
        System.out.println(System.currentTimeMillis());

        //System.out.println(ll1);

        LinkedList ll2=new LinkedList<>();
        ll2.add("A");
        ll2.add(20);
        ll2.add('C');
        System.out.println(ll2);


        LinkedList<String> ll3=new LinkedList<>();
        ll3.add("A");
        ll3.add(""+20);
        ll3.add(""+'C');
        System.out.println(ll2);
    }
}
