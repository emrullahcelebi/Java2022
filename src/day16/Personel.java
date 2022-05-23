package day16;

public class Personel {
    public String isim;
public int sayi;

    public Personel(String isim, int sayi) {
        //super();
        System.out.println("Parametreli constracter calisti");
    }

    public Personel() {
        //super();
        System.out.println("Parametresiz constracter calisti");
    }
}
