package day09;

public class Scope2 {


    public static void main(String[] args) {
        Scope1 obj4 = new Scope1();
        obj4.isim="Ahmet";
        obj4.soyisim="Celebi";
        System.out.println(obj4.isim+" "+obj4.soyisim);
    }
}
