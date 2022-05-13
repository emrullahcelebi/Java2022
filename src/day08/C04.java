package day08;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz");
        int sayi=scan.nextInt();//1234

        if (sayi<=0) {
            System.out.println("Lutfen pozitif bir tam sayi giriniz");
        }else{
            rakamlarToplami(sayi);
        }
    }

    public static void rakamlarToplami(int sayi) {

        int rakamlarToplam=0;
        String sayi2= sayi+"";
        for (int i = 1; i <=sayi2.length() ; i++) {
          rakamlarToplam+=sayi%10;
          sayi/=10;
        }
        System.out.println(rakamlarToplam);


    }
}
