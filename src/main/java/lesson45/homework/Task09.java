package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task09 {
    private static List<String> phrases = Arrays.asList("Java", "Stream", "API");

    public static void main(String[] args) {
        List<String> collect = phrases.stream().collect(Collectors.toList());
        System.out.println(collect);

    }

}
