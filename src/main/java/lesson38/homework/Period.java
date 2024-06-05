package lesson38.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Period {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2024, 3, 12);
        long until = localDate.until(localDate1, ChronoUnit.DAYS);
        System.out.println(until + " дней назад ");
        until = localDate.until(localDate1, ChronoUnit.MONTHS);
        System.out.println(until + " месяцев назад");
        until = localDate.until(localDate1, ChronoUnit.YEARS);
        System.out.println(until + " лет назад");

    }
}
