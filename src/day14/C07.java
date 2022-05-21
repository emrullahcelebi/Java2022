package day14;

import java.time.LocalDateTime;

public class C07 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-05-21T15:03:24.278267100
        System.out.println(ldt.toString());//2022-05-21T15:04:14.396863700

        String time = ldt.toString();


    }
}
