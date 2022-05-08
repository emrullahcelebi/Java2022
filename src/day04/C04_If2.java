package day04;

import java.util.Scanner;

public class C04_If2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("gunisminin ilk harfini giriniz");

        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='p' || ilkHarf =='P'){
            System.out.println("pazar, pazartesi, persembe");
        }
        if (ilkHarf=='s'|| ilkHarf=='S'){
            System.out.println("sali");
        }
        if (ilkHarf=='c'|| ilkHarf=='C'){
            System.out.println("cuma, cumartesi, carsamba");
        }
        if (ilkHarf!='p'&& ilkHarf!='P'&& ilkHarf!='c'&&ilkHarf!='C'&& ilkHarf!='s'&&ilkHarf!='S'){
            System.out.println("gecerli bir harf girin");
        }
        scan.close();
    }
}
