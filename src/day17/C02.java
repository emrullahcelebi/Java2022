package day17;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        int count=0;
        Scanner scan=new Scanner(System.in);
        while (count<100){
            System.out.println("Lutfen bolunecek tam sayi giriniz");
            int sayi1=scan.nextInt();
            System.out.println("kaca bolmek istiyorsunuz");
            int sayi2=scan.nextInt();
            System.out.println(count);
            try{
                System.out.println(sayi1/sayi2);
            }catch(ArithmeticException e){
                System.out.println("sayiyi sifira bolemezsiniz");
            }

            count++;
        }
    }
}
