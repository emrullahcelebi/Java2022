package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");


        String arr[]=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}
