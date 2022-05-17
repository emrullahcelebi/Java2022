package day11;

public class StaticBlock {

    static String isim;

    static{
        isim="Mehmet";
        System.out.println(isim);
    }

    public static void main(String[] args) {

        isim="Alican";
        System.out.println(isim);
    }


}
