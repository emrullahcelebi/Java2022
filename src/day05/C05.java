package day05;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int rakam= scan.nextInt();
        switch (rakam) {
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("lutfen rakam giriniz");
        }
        scan.close();

    }
}
