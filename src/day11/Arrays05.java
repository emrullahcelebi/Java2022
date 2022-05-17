package day11;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        int arr[]={25,17,3,8,34,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        int arrTers[]=new int[arr.length];

        for (int i = 0; i < arrTers.length; i++) {
            arrTers[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrTers));





    }
}
