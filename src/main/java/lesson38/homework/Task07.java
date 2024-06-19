package lesson38.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task07 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Ваше время: " + localDateTime);
        System.out.println("Ваше время в Японии(Токио): " + zonedDateTime);
    }
}
