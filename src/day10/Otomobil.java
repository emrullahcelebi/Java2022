package day10;

public class Otomobil {

    public Otomobil(String renk) {

    }

    public Otomobil(){//default constractor

    }
    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;


    public void yakit(String yakit) {

        System.out.println("Araba yakit olarak " + yakit + " kullanir");
    }

    public void vites(String vites) {
        System.out.println("Araba " + vites + " viteslidir");
    }

}
