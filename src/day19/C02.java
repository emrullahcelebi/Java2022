package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("src/day18/File");
int k=0;
        while((k=fis.read())!=-1){
            System.out.print((char)k);
        }
    }

}
