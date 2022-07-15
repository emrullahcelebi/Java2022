package day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, Java");
        map1.put(102, "Veli, Yan, Java");
        map1.put(103, "Ali, Yan, C#");

        String istenilenDil = "Java";

        List<String> isimList = javaBilenler(map1, istenilenDil);
        System.out.println(isimList);
    }

    private static List<String> javaBilenler(Map<Integer, String> map1, String istenilenDil) {
List<String> isimListesi=new ArrayList<>();

        for (String each: map1.values()) {

            String arr[]=each.split(", ");
            if (arr[2].equalsIgnoreCase(istenilenDil)){
                isimListesi.add(arr[0]);
            }

        }



return isimListesi;

    }

}
