package day26;

import java.util.HashMap;
import java.util.Map;

public class C02 {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();

        map1.put(101,"Ali, Can, Java");
        map1.put(102,"Veli, Yan, Java");
        map1.put(103,"Ali, Yan, C#");
        System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}


        map2.put(101,"Vehri, Ban, Java");
        map2.put(102,"Esra, Cob, SQL");

        System.out.println(map2);//{101=Vehri, Ban, Java, 102=Esra, Cob, SQL}

        map1.putAll(map2);
        System.out.println(map1);//{101=Vehri, Ban, Java, 102=Esra, Cob, SQL, 103=Ali, Yan, C#}
map1.putIfAbsent(102,"Ahmet, Demir, Java");
        System.out.println(map1);
        map1.putIfAbsent(100,"Ahmet, Demir, Java");
        System.out.println(map1);

        System.out.println(map1.containsKey(101));
        System.out.println(map1.containsValue("Java"));
        System.out.println(map1.containsValue("Vehri, Ban, Java"));

    }
}
