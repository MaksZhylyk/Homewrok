package lesson38.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task07 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId );
        System.out.println("Ваше время: " + localDateTime);
        System.out.println("Ваше время в Японии(Токио): " + zonedDateTime);
    }
}
