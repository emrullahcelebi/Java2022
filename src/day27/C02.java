package day27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02 {
    public static void main(String[] args) {

        String imput="Hellooo";
        Map<String,Integer> methoddanGelenMap= harfSayisiBul(imput);


        System.out.println(methoddanGelenMap);
    }

    private static Map<String, Integer> harfSayisiBul(String imput) {

        String harfler[]=imput.split("");
        System.out.println(Arrays.toString(harfler));//[H, e, l, l, o, o, o]
Map<String,Integer> harfKullanimSayisi=new HashMap<>();

        for (String each:harfler) {
            if (!harfKullanimSayisi.containsKey(each)) {
                harfKullanimSayisi.put(each,1);
            }else{
                harfKullanimSayisi.put(each,harfKullanimSayisi.get(each)+1);
            }


        }

        return harfKullanimSayisi;
    }
}
