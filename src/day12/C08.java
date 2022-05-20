package day12;

import java.util.Arrays;
import java.util.List;

public class C08 {
    public static void main(String[] args) {


        String arr[]={"Ali","Veli"};

        List<String> listArr= Arrays.asList(arr);
        System.out.println(listArr);//[Ali, Veli]

        Integer arr1[]={1,2,3,4};
        List<Integer> list2=Arrays.asList(arr1);
        System.out.println(list2);//[1, 2, 3, 4]

    }
}
