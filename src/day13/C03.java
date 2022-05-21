package day13;

public class C03 {
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println("%10 indirimli fiyat : "+indirimUygula10(fiyat));
        System.out.println("%20 indirimli fiyat : "+indirimUygula20(fiyat));
        System.out.println("%25 indirimli fiyat : "+indirimUygula25(fiyat));
        System.out.println("method call dan sonra fiyat : "+fiyat);
    }

    public static double indirimUygula25(double fiyat) {
        fiyat*=0.75;
        return fiyat;
    }

    public static double indirimUygula20(double fiyat) {
        fiyat*=0.80;
        return fiyat;
    }

    public static double indirimUygula10(double fiyat) {
        fiyat*=0.90;
        return fiyat;
    }
}
