package day08;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir rakam girin");
        int rakam=scan.nextInt();

        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <=rakam ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
