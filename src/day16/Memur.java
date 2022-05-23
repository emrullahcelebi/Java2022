package day16;

public class Memur extends Personel{


    public int maas;

public Memur(int maas){
    super();
    System.out.println("Child class Parametreli constracter calisti");
}
    public Memur() {
        //super();
        System.out.println("Child class Parametresiz constracter calisti");
    }

    public static void main(String[] args) {
        Memur obj1=new Memur(2400);


    }
}
