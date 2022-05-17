package day11;

import java.util.Arrays;

public class Arrays09 {
    public static void main(String[] args) {
        int arr1[]={10,25,5,20};
        int arr2[]={25,10,20,5};
        System.out.println(Arrays.equals(arr1,arr2));

        Arrays.sort(arr2);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr1,arr2));

    }
}
