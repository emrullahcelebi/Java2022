package day04;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        if (kenar1==kenar2){
            System.out.println("karedir");

        }else{
            System.out.println("kare degildir");

        }
        scan.close();

    }
}
