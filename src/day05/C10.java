package day05;

import java.util.Locale;

public class C10 {
    public static void main(String[] args) {
        String str="Was denken Sie";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));


    }
}
