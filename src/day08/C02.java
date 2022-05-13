package day08;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1>sayi2){
            for (int i = sayi1; i >=sayi2 ; i--) {
                System.out.print(i+" ");
            }
        }else{//sayi1<=sayi2
            for (int i = sayi1; i <=sayi2 ; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
