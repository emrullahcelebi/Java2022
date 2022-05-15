package day10;

public class ParametreliRunner {
    public static void main(String[] args) {
        ParametreliConstractor oto1=new ParametreliConstractor();
        System.out.println(oto1.marka+" "+oto1.model+" "+oto1.yil+" "+oto1.kazasiVarMi);

        ParametreliConstractor oto2=new ParametreliConstractor(2010);
        System.out.println(oto2.marka+" "+oto2.model+" "+oto2.yil+" "+oto2.kazasiVarMi);
        ParametreliConstractor oto3=new ParametreliConstractor("Toyota","Corolla",2010,true);
        System.out.println(oto3.marka+" "+oto3.model+" "+oto3.yil+" "+oto3.kazasiVarMi);
    }
}
