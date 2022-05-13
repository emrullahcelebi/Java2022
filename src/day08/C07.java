package day08;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        /*
        *
        * *
        * * *
        * * * *
         */


        Scanner scan=new Scanner(System.in);
        System.out.println(" 10 dan kucuk bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
scan.close();
    }
}
