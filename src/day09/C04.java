package day09;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak icin pozitif tam sayilari sirayla giriniz");
        System.out.println("Islemi bitirmek icin '0' a basiniz");

        int sayi = 1;
        int toplam = 0;
        int negatif=0;
        int pozitif=0;

        do {


            sayi = scan.nextInt();

            if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negatif++;
            }else{
                toplam += sayi;
                pozitif++;
            }

        } while (sayi!=0);
        System.out.println(toplam);
        System.out.println("negatif giris sayisi : "+ negatif);
        System.out.println("pozitif giris sayisi : "+ pozitif);
    }
}
