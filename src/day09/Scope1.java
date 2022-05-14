package day09;

public class Scope1 {
   public int sayi;//Instance(Object)
    public String isim="Mehmet";
    public String soyisim;

    public static void main(String[] args) {
        //System.out.println(sayi);//
        Scope1 obj1 = new Scope1();//Obje olusturduk
        System.out.println(obj1.sayi);//default deger atar 0
        System.out.println(obj1.isim);//Mehmet
        System.out.println(obj1.soyisim);//null

        Scope1 obj2 = new Scope1();
        obj2.isim="Muslum";
        obj2.soyisim="Baba";


    }

    public static void staticMethod(){

    }

    public void medhod(){

    }
}
