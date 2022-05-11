package day06;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");

        String cumle= scan.nextLine();
        cumle=cumle.replace(" ","");
        cumle=cumle.replace("a","e");
        System.out.println(cumle);

        //System.out.println(cumle.replace("a","i").replace('e','i'));


    }
}
