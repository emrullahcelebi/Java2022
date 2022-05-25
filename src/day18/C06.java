package day18;

import java.util.ArrayList;
import java.util.List;

public class C06 {
    public static void main(String[] args) {

        int arr[]={1,2,5,6};
        System.out.println(arr[1]);//2
        System.out.println(arr[3]);//6
       // System.out.println(arr[5]);//ArrayIndexOutOfBoundsException


        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Cemal");
        list.add("Celil");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(3));//IndexOutOfBoundsException

    }
}
