package day17;

public class GeciciIsci extends Isci{
    public String calistigiBolum="Yemekhane";

    public static void main(String[] args){
        GeciciIsci gi1=new GeciciIsci();
        System.out.println(gi1.maasHesapla());
        gi1.mesai();

    }
    public int maasHesapla(){
        return 30*8*10;
    }

    @Override
    public void mesai() {
        //super.mesai();
        System.out.println("Gecici siciler haftasda 25 saat caLISIR");
    }
}
