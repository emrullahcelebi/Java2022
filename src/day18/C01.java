package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01 {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Thinkpad\\IdeaProjects\\ecl\\Java2022\\src1\\day18\\File");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Kod bloke olmamis");
    }
}
