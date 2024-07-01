package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task10 {
    private static List<String> messages = Arrays.asList("hello", "world", "streams", "are", "cool");

    public static void main(String[] args) {
        System.out.println(messages.stream().map(String::length).reduce((x, y) -> x + y));

    }

}
