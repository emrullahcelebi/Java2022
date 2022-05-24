package day17;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolunecek tam sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("kaca bolmek istiyorsunuz");
        int sayi2=scan.nextInt();
        try{
            System.out.println(sayi1/sayi2);
        }catch(ArithmeticException e){
            System.out.println("sayi sifira bolunmez");
        }


    }
}
