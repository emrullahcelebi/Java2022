package day08;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz");

        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
        scan.close();
    }
}
