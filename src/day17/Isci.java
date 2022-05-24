package day17;

public class Isci extends Personel{
    public String bolum="Kaynak atolyesi";
    public int maas=5000;
    public String isim="Mesut";

    public int maasHesapla(){
        return 30*8*15;
    }
    public void mesai(){
        System.out.println("isciler gunluk 8 saat calisir");
    }
}
