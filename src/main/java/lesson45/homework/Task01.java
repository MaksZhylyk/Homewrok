package lesson45.homework;

import java.util.Arrays;
import java.util.List;

public class Task01 {
   private static List<String> fruits =  Arrays.asList("apple", "banana", "cherry");

    public static void main(String[] args) {
        fruits.stream().forEach(System.out::println);
    }

}
