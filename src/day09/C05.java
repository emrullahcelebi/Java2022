package day09;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre="";
        int sonuc=0;

        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.nextLine();
            sonuc= kucukHarfVarMi(sifre)+buyukHarfVarMi(sifre)+ozelKarakterVarMi(sifre)+uzunlukUygunMu(sifre);

        }while (sonuc !=4);
        System.out.println("sifreniz basarili");



    }

    public static int uzunlukUygunMu(String sifre) {
        int sonucUzunluk=0;

        if (sifre.length()<8) {
            System.out.println("sifre en az 8 karakter olmalidir");
        }else{
            sonucUzunluk=1;
        }
        return sonucUzunluk;
    }

    public static int ozelKarakterVarMi(String sifre) {
        int ozelKarakter=0;
        int index=0;

        while (index<sifre.length()){
            if (sifre.charAt(index)>' ' && sifre.charAt(index)<'/') {
                ozelKarakter=1;
            }
            index++;
        }
        if (ozelKarakter==0){
            System.out.println("sifre ozel karakter icermelidir");
        }

        return ozelKarakter;
    }

    public static int buyukHarfVarMi(String sifre) {
        int flagBuyuk=0;
        int index=0;

        while (index<sifre.length()){
            if (sifre.charAt(index)>'A' && sifre.charAt(index)<'Z') {
                flagBuyuk=1;
            }
            index++;
        }
        if (flagBuyuk==0){
            System.out.println("sifre buyuk harf icermelidir");
        }

        return flagBuyuk;
    }

    public static int kucukHarfVarMi(String sifre) {
        int flagKucuk=0;
        int index=0;

        while (index<sifre.length()){
            if (sifre.charAt(index)>'a' && sifre.charAt(index)<'z') {
                flagKucuk=1;
            }
            index++;
        }
        if (flagKucuk==0){
            System.out.println("sifre kucuk harf icermelidir");
        }

        return flagKucuk;
    }
}
