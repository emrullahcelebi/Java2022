package day17;

public class Formen extends Isci{
    public String sorumluOldBolum="bakim";

    public static void main(String[] args) {

        Formen fr1=new Formen();
        fr1.sorumluOldBolum="Marangoz";
        fr1.maas=10000;
        System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas);

    }
}
