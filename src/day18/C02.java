package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("src/day18/File");
            int k=0;
                try {
                    while((k=fis.read())!=-1){
                        System.out.print((char)k);
                    }
                } catch (IOException e) {//dosyalarla ilgili yazma ve okuma sorunlari handel eder
                    e.printStackTrace();
                }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Kod bloke olmamis");
    }
}
