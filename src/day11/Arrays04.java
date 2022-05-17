package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac sayi gireceginizi soyleyin");
        int uzunluk=scan.nextInt();
              
        
        int arr[]=new int[uzunluk];
        System.out.println("Lutfen sayilari giriniz");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
