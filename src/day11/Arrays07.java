package day11;

import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        int arr[]={10,25,34,16,75};
        int sayi = 2;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("array sorulan elemani iceriyor");
        }else{
            System.out.println("array sorulan elemani icermiyor");
        }

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,sayi));

        int arr2[]={1,3,4,867,43,23};
        System.out.println(Arrays.toString(arr2));

        String arrayString = Arrays.toString(arr2);
        System.out.println(arrayString.substring(0));
















    }
}
