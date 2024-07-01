package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {
    private static List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    public static void main(String[] args) {
        List<String> autoUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(autoUpperCase);
    }

}
