package lesson38.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task04 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 31, 23, 59);
        String format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(localDateTime);
        System.out.println(format);

    }

}
