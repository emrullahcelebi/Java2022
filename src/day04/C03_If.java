package day04;

import java.util.Scanner;

public class C03_If {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        }
        if(sayi%2==1){
            System.out.println("girdiginiz sayi tek sayi");
        }
        scan.close();
    }

}
