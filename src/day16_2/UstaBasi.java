package day16_2;

public class UstaBasi extends Isci {

    public String bolum="Takimhane";
    public int sorOldIscissay=10;




    public static void main(String[] args) {

        UstaBasi ub1=new UstaBasi();

        System.out.println(ub1.bolum);
        System.out.println(ub1.sorOldIscissay);
        System.out.println(ub1.saatUcreti);
        System.out.println(ub1.isim);


        Isci ub2=new UstaBasi();
        System.out.println(ub2.departman);
        System.out.println(ub2.izindeMi);

        Personel ub3=new UstaBasi();

        System.out.println(ub3.id);



    }
}
