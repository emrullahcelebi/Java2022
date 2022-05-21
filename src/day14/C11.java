package day14;



public class C11 {
    public static void main(String[] args) {
        toplama(2,5);
        toplama(4,5,6);
        toplama(20,30,30,12);
    }
    public static void toplama(int... var){
        int toplam=0;
        for (int j:var
             ) {
            toplam+=j;

        }
        System.out.println(toplam);

    }
}
