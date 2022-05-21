package day13;

public class C2 {
    public static void main(String[] args) {

        double fiyat=100;

        indirimUygula(fiyat);
        System.out.println("method sonrasi fiyat :"+fiyat);
    }

    public static void indirimUygula(double fiyat) {
        fiyat=fiyat*0.90;
        System.out.println("%10 indirimli fiyat : "+ fiyat);

    }
}
