package lesson44.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> autoUpperCase = items.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(autoUpperCase);
    }
}
