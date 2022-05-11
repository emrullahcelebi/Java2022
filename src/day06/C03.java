package day06;

import java.util.Locale;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println("aramak istediginiz kelimeyi giriniz");
        String kelime=scan.nextLine().toLowerCase();

        String sorgu= cumle.contains(kelime) ? "Basarili":"Basarisiz";
        System.out.println(sorgu);

scan.close();
    }
}
