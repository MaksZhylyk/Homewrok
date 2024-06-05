package lesson38;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class javaTimeMuster {
    public static void main(String[] args) {
      LocalDate localDate = LocalDate.now();
      LocalDate localDate1 = LocalDate.of(2024, 6, 20);
        System.out.println(localDate);
        System.out.println(localDate1);


        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(13, 46);
        System.out.println(localTime);
        System.out.println(localTime1);


        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 9, 12, 20, 00);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);


        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 1, 1, 12, 45);
        ZoneOffset zoneOffset = ZoneOffset.of("+2");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime2, zoneOffset);
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime3 = localDateTime.of(2024, 6, 5, 21, 17, 39);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime3, zoneId);
        System.out.println(zonedDateTime);

        YearMonth yearMonth = YearMonth.of(2024, Month.APRIL);
        System.out.println(yearMonth);

        Year year = Year.of(2024);
        System.out.println(year);
        System.out.println("---------------------");

        MonthDay monthDay = MonthDay.of(Month.APRIL, 6);
        System.out.println(monthDay);

        LocalDate localDate2 = LocalDate.of(2024, 01, 01);
        localDate2 = localDate2.plusDays(24);
        System.out.println(localDate2);
        localDate2 = localDate2.minusDays(36);
        System.out.println(localDate2);
        if(LocalDate.now().isAfter(localDate2)){
            System.out.println("is after now");
        } else {
            System.out.println("is before now");
        }

        LocalDate date = LocalDate.parse("2024-11-02");
        System.out.println(date);

        LocalDateTime localDateTimeToParse = LocalDateTime.parse("2024-02-02T12:30:23");
        System.out.println(localDateTimeToParse);

        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN).format(LocalDate.of(2024, 6, 5));
        System.out.println(format);

        LocalDate startLocalDate = LocalDate.parse("2024-02-02");
        LocalDate endLocalDate = LocalDate.parse("2024-12-02");
        System.out.println(startLocalDate);
        System.out.println(endLocalDate);

    }

}
