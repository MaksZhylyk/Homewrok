package lesson44.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
       items.stream().forEach(System.out::println);
    }
}
