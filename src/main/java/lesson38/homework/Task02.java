package lesson38.homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task02 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7, 45);
        LocalTime localTime1 = LocalTime.of(20, 45);
        LocalTime localTime2 = LocalTime.now();
        if(localTime.isAfter(localTime2)){
            System.out.println("Is after " + localTime2);
        } else {
            System.out.println("Is before " + localTime2);
        }
        if(localTime1.isBefore(localTime2)){
            System.out.println("Is before " + localTime2);
        } else{
            System.out.println("Is after " + localTime2);
        }
    }
}
