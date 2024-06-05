package lesson38.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task05 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime nextNewYear = LocalDateTime.of(2024, 12, 31, 23, 59, 59);
        long until = localDateTime.until(nextNewYear, ChronoUnit.DAYS);
        System.out.println(until + " дней осталось до нового года");
        until = localDateTime.until(nextNewYear, ChronoUnit.HOURS);
        System.out.println(until + " часов осталось до новго года");
       until = localDateTime.until(nextNewYear, ChronoUnit.MINUTES);
        System.out.println(until + " минут осталось до новго года");
    }
}
