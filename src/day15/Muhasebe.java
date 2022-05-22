package day15;

public class Muhasebe extends Personel {

    public int saatUcreti;
    public String statu;
    public int maas;

    public int maasHesapla(){
        maas=30*8*saatUcreti;
        return maas;
    }

}
