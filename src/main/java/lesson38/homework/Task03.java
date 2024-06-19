package lesson38.homework;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task03 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2024, 3, 12);
        Period period = Period.between(localDate, localDate1);
        System.out.println(period.toString());
        long until = localDate.until(localDate1, ChronoUnit.DAYS);
        System.out.println(until * (-1) + " дней назад ");
        until = localDate.until(localDate1, ChronoUnit.MONTHS);
        System.out.println(until * (-1) + " месяцев назад");
        until = localDate.until(localDate1, ChronoUnit.YEARS);
        System.out.println(until * (-1) + " лет назад");

    }


}
