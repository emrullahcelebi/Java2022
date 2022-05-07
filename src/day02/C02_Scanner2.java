package day02;

import java.util.Scanner;

public class C02_Scanner2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        Scanner scan2=new Scanner(System.in);
        System.out.println("soyisminizi giriniz");
        String soyisim=scan2.nextLine();
        System.out.println(isim+" "+soyisim);

    }
}
