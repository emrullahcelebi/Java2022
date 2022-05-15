package day10;

import com.sun.source.tree.Scope;

public class Scope2 {
    public static void main(String[] args) {


        System.out.println(Scope1.okulAdi);//Yildiz Koleji
        System.out.println(Scope1.okulId);//1201

        Scope1.okulAdi="Mehmet koleji";
        System.out.println(Scope1.okulAdi);

        Scope1.staticMethod();
        System.out.println(Scope1.okulId);
    }
}
