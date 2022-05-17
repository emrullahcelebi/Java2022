package day11;

public class Static1 {

    static String isim = "Mehmet";
    int yas = 49;

    public static void main(String[] args) {
        Static1 st1 = new Static1();
        Static1 st2 = new Static1();
        Static1 st3 = new Static1();



        st1.isim = "Ali";
        st1.yas = 25;
        System.out.println(st1.isim+" "+st1.yas);

        st2.isim="Ayse";
        st2.yas=30;

        System.out.println(st2.isim+" "+st2.yas);
        System.out.println(st1.isim+" "+st1.yas);

        st3.isim="Can";
        st3.yas=40;



    }

}
