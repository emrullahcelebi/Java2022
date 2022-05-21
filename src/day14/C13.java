package day14;

import java.util.ArrayList;
import java.util.List;

public class C13 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);

//toplama(list);
        int arr[]={15,20,34};
        toplama(arr);


    }
    public static void toplama(int... var){

        int toplam=0;
        for (int each: var
        ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
