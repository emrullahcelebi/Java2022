package day07;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("tam sayi giriniz");
        int sayi= scan.nextInt();

        pozitifNegatif(sayi);
        tekMiciftMi(sayi);

        scan.close();
    }


    public static void pozitifNegatif(int sayi) {
        System.out.println(sayi>0? "pozitif":(sayi<0 ? "Negatif": "pozitif veya negatif degil"));
    }
    public static void tekMiciftMi(int sayi){
        if (sayi%2==0) {
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }
    }
}
