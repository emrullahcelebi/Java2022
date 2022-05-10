package day05;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("iki sayi giriniz");
        double x=scan.nextDouble();
        double y=scan.nextDouble();

        double z= x>y ? x:y;
        System.out.println("en buyuk sayi karsinizda"+" : " + z);

    }
}
