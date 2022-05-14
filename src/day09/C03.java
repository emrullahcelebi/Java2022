package day09;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi=0;

        do{

            System.out.println("Lutfen pozitif bir sayi giriniz");
            sayi=scan.nextInt();

        }while (sayi<=0);
        System.out.println("afferim");


        scan.close();
    }
}
