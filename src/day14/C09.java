package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C09 {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-05-21T18:53:11.340381400

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
        System.out.println(dtf.format(ldt));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf2.format(ldt));//18:58

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf3.format(ldt));//06:59

        LocalDate dogumTarihi=LocalDate.of(1988,1,16);
        LocalDate bugun=LocalDate.now();

        Period benimYasim=Period.between(bugun, dogumTarihi);
        System.out.println(benimYasim);//P-34Y-4M-5D
        int yas=Period.between(dogumTarihi,bugun ).getYears();
        System.out.println(yas);//34
    }

}
