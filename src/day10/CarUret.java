package day10;

public class CarUret {

    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;


    public CarUret(){//bu constracter dir
                        // public oldugunda her yerden kullanilir


    }

    public void yakit(String yakit){

        System.out.println("Araba yakit olarak "+ yakit+" kullanir");
    }

    public void vites(String vites){
        System.out.println("Araba "+vites+" viteslidir");
    }
}
