package day04;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("bir karekter giriniz");
        char karakter=scan.next().charAt(0);
        if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')) {
            System.out.println("girilen karakter harf");
        }else{
            System.out.println("girilen karakter harf degil");
        }
        scan.close();
    }
}
