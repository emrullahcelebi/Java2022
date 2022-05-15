package day10;

public class Car {

    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;

    public static void main(String[] args) {
        Car car1=new Car(); //Obje
        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);

        car1.marka="Toyota";
        car1.model="Corollo";
        car1.yil=2010;
        car1.kazasiVarMi=false;
        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);


        Car car2=new Car(); //Obje

        car2.marka="Opel";
        car2.model="Astra";
        car2.yil=2020;
        car2.kazasiVarMi=true;

        System.out.println(car2.marka+" "+car2.model+" "+car2.yil+" "+car2.kazasiVarMi);

        car1.kazasiVarMi=true;
        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);




    }
}
