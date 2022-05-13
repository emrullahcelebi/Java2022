package day08;

public class C09 {
    public static void main(String[] args) {

        for (int i = 10; i <= 30; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int sayi = 10;
        while (sayi <= 30) {
            if (sayi % 4 == 0) {
                System.out.print(sayi + " ");
            }

            sayi++;
        }
    }
}
