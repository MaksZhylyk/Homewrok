package lesson44.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task03 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "ban", "cherry", "date" );
        items.stream().filter(x -> x.toString().length() > 3).forEach(System.out::println);
    }
}
