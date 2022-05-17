package day10;

public class ParametreliConstractor {


    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;

    public ParametreliConstractor(int yil){
        this.yil=yil;

    }
    public ParametreliConstractor(){//default

    }
    public ParametreliConstractor(String marka, String model){

    }
    public ParametreliConstractor(String marka,String model,int yil, boolean kazasiVarMi){
this.yil=yil;
this.marka=marka;
this.model=model;
this.kazasiVarMi=kazasiVarMi;
    }

    public void yakit(String yakit){

        System.out.println("Araba yakit olarak "+ yakit+" kullanir");
    }

    public void vites(String vites){
        System.out.println("Araba "+vites+" viteslidir");
    }
}

