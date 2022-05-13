package day08;

public class C10 {
    public static void main(String[] args) {

        for (int i = 100; i <1000 ; i++) {
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        int sayi=100;
        while (sayi<1000) {
            if (sayi%15==0 && sayi%20==0 && sayi%90==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
    }
}
