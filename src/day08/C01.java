package day08;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("iki pozitif tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int kucukSayi = 0;
        int buyukSayi = 0;


        if (sayi1 < 0 || sayi2 < 0) {
            System.out.println("Lutfen pozitif tam sati giriniz");
        } else if (sayi1 > sayi2) {
            kucukSayi = sayi2;
            buyukSayi = sayi1;

        } else {
            buyukSayi = sayi2;
            kucukSayi = sayi1;
        }
        for (int i = kucukSayi; i <=buyukSayi ; i++) {
            System.out.print(i+",");

        }
    }
}
