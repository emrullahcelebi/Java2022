package day20;

public abstract class Personel {

    public String isim="Yasin";

    public abstract void maasHesapla();
    public abstract void mesaiBilgisi();


    public void ozelSigorta(){
        System.out.println("Personel ozel sigortalidir");
    }
}
