package day14;

public class C12 {
    public static void main(String[] args) {

        toplama(2,5);
        toplama(4,5,6);
        toplama(20,30,30,12);




        }
    public static void toplama(int sayi1,int... var){
        System.out.println(sayi1);
        int toplam=0;
        for (int each: var
             ) {
            toplam+=each;
        }
        System.out.println(sayi1*toplam);
    }
}
