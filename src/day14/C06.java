package day14;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class C06 {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);//14:49:45.658770400


        for (int i = 0; i < 1000000; i++) {
            i+=1;
        }
        LocalTime saat2=LocalTime.now();
        System.out.println(saat2);

        System.out.println(saat.plusHours(15));
        System.out.println(saat.getSecond());

        System.out.println(saat.now(ZoneId.of("Japan")));

    }
}
