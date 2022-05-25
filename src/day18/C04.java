package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/day18/File");
            int k = 0;//konteyner

            while ((k = fis.read()) != -1) {//once indeks kontrol ediyor sonra ascii ye cevirip bakiyor
                System.out.print((char) k);//sonra char a ceviriyor
            }
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Kod bloke olmamis");

    }
}
