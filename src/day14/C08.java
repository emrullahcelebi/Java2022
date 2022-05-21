package day14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C08 {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMM/d");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MM/dd");
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("y/M/d");
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("yyyy-MMMM-d");
        LocalDate tarih=LocalDate.now();

        System.out.println(dtf.format(tarih));//2022/May/21
        System.out.println(dtf2.format(tarih));//22/05/21
        System.out.println(dtf3.format(tarih));//2022/5/21
        System.out.println(dtf4.format(tarih));//2022/5/21

    }
}
