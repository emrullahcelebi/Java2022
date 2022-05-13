package day08;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("40 dan kucuk pozzitif bir sayi giriniz");
        int sayi = scan.nextInt();

        faktoriyel(sayi);

scan.close();
    }

    public static void faktoriyel(int sayi) {

        int faktop = 1;

        for (int i = 1; i <= sayi; i++) {
            faktop *= i;
        }
        System.out.println(faktop);
    }
}
