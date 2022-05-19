package day12;

import java.util.ArrayList;
import java.util.List;

public class C2 {
    public static void main(String[] args) {

        //1. yol
        ArrayList<String> list=new ArrayList<String>();

        //2.yol
        ArrayList<String> list2=new ArrayList<>();

        //3.yol en cok kullanilan
        List<String> list3=new ArrayList<>();

        //List<String> list4= new List<>();

        list3.add("Ali");
        list3.add("Veli");
        list3.add("Ayse");
        System.out.println(list3);//[Ali, Veli, Ayse]

        list3.add(1,"Can");
        System.out.println(list3);//[Ali, Can, Veli, Ayse]
        list3.add(1,"Fatma");
        System.out.println(list3);//[Ali, Fatma, Can, Veli, Ayse]

        int arr[] = {2, 3, 5, 3, 6, 4, 3, 6, 7};
        int sayi = 6;
        List<Integer> istenilenList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=sayi) {
                istenilenList.add(arr[i]);
            }
        }
        System.out.println(istenilenList);



















    }
}
