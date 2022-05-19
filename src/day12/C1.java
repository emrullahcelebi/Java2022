package day12;

import java.util.Arrays;

public class C1 {
    public static void main(String[] args) {


        int arr[] = {2, 3, 5, 3, 6, 4, 3, 6, 7};
        int sayi = 6;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                count++;
            }
        }
            int arr2[] = new int[arr.length - count];


            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != sayi) {
                    arr2[temp] = arr[j];
                    temp++;
                }
            }
            System.out.println(Arrays.toString(arr2));


        }
    }



