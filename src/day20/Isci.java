package day20;

public class Isci extends Personel{
    public static void main(String[] args) {
        Isci isci1=new Isci();
        isci1.maasHesapla();
        isci1.mesaiBilgisi();
        isci1.isim="Ali";
        isci1.ozelSigorta();
    }
    @Override
    public void maasHesapla() {
        System.out.println("isciler icin maas 5000 tl");
    }

    @Override
    public void mesaiBilgisi() {
        System.out.println("isciler gunluk 8 saat cak=lisir");
    }
}
