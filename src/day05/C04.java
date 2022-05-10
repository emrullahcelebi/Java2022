package day05;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int rakam= scan.nextInt();

        if (rakam==0){
            System.out.println("sifir");
        }else if (rakam==1){
            System.out.println("bir");
        }else if (rakam==2){
            System.out.println("iki");
        }else if (rakam==3){
            System.out.println("uc");
        }else if (rakam==4){
            System.out.println("dort");
        }else if (rakam==5){
            System.out.println("bes");
        }else if (rakam==6){
            System.out.println("alti");
        }else if (rakam==7){
            System.out.println("yedi");
        }else if (rakam==8){
            System.out.println("sekiz");
        }else if (rakam==9){
            System.out.println("dokuz");
        }else{
            System.out.println("lutfen rakam giriniz");
        }
        scan.close();
    }
}
