package day27;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C04 {
    public static void main(String[] args) {
        String dosyaYolu="C:\\Users\\Thinkpad\\Desktop\\VeriTabani.csv";

        Map<String,String> veriMap=veriTabaniAl(dosyaYolu);
        System.out.println(veriMap);
    }

    public static Map<String, String> veriTabaniAl(String dosyaYolu) {

        Map<String,String> eklenecekMap=new HashMap<>();

       try {
            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));


                String satir = br.readLine();

               while (satir !=null){
                   String keyValueArr[]=satir.split(";");
                   eklenecekMap.put(keyValueArr[0],keyValueArr[1] );

                   satir=br.readLine();
               }


        }catch (IOException e){
            e.printStackTrace();//detayli hata veriyor
        }


        return eklenecekMap;
    }
}
