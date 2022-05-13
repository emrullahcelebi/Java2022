package day08;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz");
        int sayi=scan.nextInt();//1234

        System.out.println("bir sinir degeri giriniz");
        int sinir= scan.nextInt();

        if (sayi<=0) {
            System.out.println("Lutfen pozitif bir tam sayi giriniz");
        }else{
            if (rakamlarToplamiHesapla(sayi)>sinir){
                System.out.println("girilen deger sinir degerinden buyuk");
            }else{
                System.out.println("girilen deger sinir degerinden kucuk");
            }

        }
    }

    public static int rakamlarToplamiHesapla(int sayi) {
        int rakamlarToplami=0;
        String sayi2= sayi+"";
        for (int i = 1; i <=sayi2.length() ; i++) {
            rakamlarToplami += sayi % 10;
            sayi /= 10;
        }
            return rakamlarToplami;
    }


}
