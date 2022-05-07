package day03;

import java.util.Locale;
import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);//ilk harfi aliyoruz
        System.out.println(ilkHarf);
        scan.close();




    }
}
