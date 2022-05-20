package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pazotif bir sayi giriniz");
        int sayi=scan.nextInt();

        List<Integer> fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        System.out.println(fibo);//[1, 1]

        for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {

            fibo.add(fibo.get(i-2)+fibo.get(i-1));

        }
        System.out.println(fibo);
    }
}

