package day06;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.next();
        System.out.println("soyisim giriniz");
        String soyisim=scan.next();
        System.out.println("kart numaranizi giriniz giriniz");
        String kartNo=scan.next();

        char isimIlkHarf=isim.toUpperCase().charAt(0);
        String isimGeriKalan=isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf=soyisim.toUpperCase().substring(0,1);
        String soyisimGeriKalan=soyisim.substring(1).replaceAll("\\w","*");
        String kartNoBasi="**** **** **** ";
        String kartNoSonu=kartNo.substring(kartNo.length()-4);

        System.out.println("isminiz ve soy isminiz : "+isimIlkHarf+isimGeriKalan+" "
                            +soyisimIlkHarf+soyisimGeriKalan);
        System.out.println("Kart no : "+kartNoBasi+kartNoSonu);




    }
}
