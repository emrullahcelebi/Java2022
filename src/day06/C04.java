package day06;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        String str="Java'la hayat ne guzel";
        System.out.println(str.endsWith("zel"));//true


        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");

        String mail=scan.next();
        if (!mail.contains("@")) {//! icermiyor ise oluyor
            System.out.println("girdiginiz bilgi email degil");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("lutfen email adresi giriniz");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("mailiniz kaydedildi");
        }else{
            System.out.println("gecersiz mail adresi");
        }
scan.close();

    }
}
