package day09;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();


        String flag="Yok";
        int index=0;


        while (index<cumle.length()) {

            if (cumle.charAt(index)>='A'&& cumle.charAt(index)<='Z') {
                flag="var";
            }
            index++;
        }
        System.out.println(flag);
    }
}
