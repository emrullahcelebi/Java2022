package day06;

import java.util.Locale;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");

        String cumle = scan.nextLine().toLowerCase();

        String sorgu = cumle.indexOf("java") >= 0 ?
                (cumle.indexOf("java") != cumle.lastIndexOf("java")
                        ? "birden cok java iceriyor" : "1 java iceriyor")
                : ("java icermiyor");

        System.out.println(sorgu);


    }
}
