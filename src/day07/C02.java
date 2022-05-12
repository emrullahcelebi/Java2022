package day07;

public class C02 {
    public static void main(String[] args) {

    ortalama(10,20,30);
    ortalama(10,20);

    }
    public static void ortalama(double sayi1, double sayi2, double sayi3){
        System.out.println("ortalama : "+(sayi1+sayi2+sayi3)/3);
    }
    public static void ortalama(double sayi1, double sayi2){
        System.out.println("ortalama : "+(sayi1+sayi2)/2);
    }
}
