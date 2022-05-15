package day10;

public class Scope1 {

    static int okulId = 1201;
    static String okulAdi = "Yildiz Koleji";
    static boolean acikMi;


    public static void main(String[] args) {
        System.out.println(okulId + " " + okulAdi + " " + acikMi);//1201 Yildiz Koleji false

        okulId = 1202;
        acikMi = true;

        staticMethod();

    }

    public static void staticMethod() {
        System.out.println(okulId + " " + okulAdi + " " + acikMi);//1202 Yildiz Koleji false
        okulId=1203;
    }

    public void method() {
        okulId = 1205;
    }
}
