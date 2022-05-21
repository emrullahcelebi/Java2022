package day14;

import java.time.LocalDate;

public class C05 {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-05-21

        System.out.println(tarih.plusWeeks(20));//2022-10-08
        System.out.println(tarih.plusDays(500));//2023-10-03
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(20));
        System.out.println(tarih.minusMonths(3));
        System.out.println(tarih.isLeapYear());//false

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());
      LocalDate dogumGunu=LocalDate.of(1988,01,16);
        System.out.println(dogumGunu.getDayOfWeek());//SATURDAY



        LocalDate tarih1=LocalDate.of(1995,12,15);
        LocalDate tarih2=LocalDate.of(1995,12,10);
        System.out.println(tarih1.isAfter(tarih2));//true
        System.out.println(tarih1.isBefore(tarih2));//false

        System.out.println(tarih.getDayOfYear());
    }
}
