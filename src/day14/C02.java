package day14;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        String isim="Ali";
        isim.concat("can");
        System.out.println(isim);//Ali
        System.out.println(isim.concat("can"));//Alican
        System.out.println(isim);//Ali

        List<String> isimList=new ArrayList<>();
        System.out.println(isimList);
        isimList.add("Ali");
        isimList.add("Can");
        System.out.println(isimList);
        isimList.remove(1);
        System.out.println(isimList);//[Ali]
    }
}
