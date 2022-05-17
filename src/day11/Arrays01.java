package day11;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int sayi=10;
        int sayi2=20;
        int sayi3=40;
        int sayi4=60;
        String isim="Ali";

        int arr[]={10,20,40};
        System.out.println(arr);//[I@7699a589
        System.out.println(Arrays.toString(arr));//[10, 20, 40]

        String takim[]=new String[8];//[null, null, null]
        System.out.println(Arrays.toString(takim));

        takim[0]="Ali";
        System.out.println(Arrays.toString(takim));

        takim[1]="Veli";
        takim[2]="Can";
        System.out.println(Arrays.toString(takim));//[Ali, Veli, Can]

        takim[1]="Kemal";
        System.out.println(Arrays.toString(takim));

        System.out.println(takim.length);//3;

        takim[takim.length-1]="Mehmet";
        System.out.println(Arrays.toString(takim));


    }
}
