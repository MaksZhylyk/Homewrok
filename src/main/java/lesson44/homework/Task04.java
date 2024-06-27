package lesson44.homework;

import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        items.stream().filter(x ->x.startsWith("c")).forEach(System.out::println);
    }
}
