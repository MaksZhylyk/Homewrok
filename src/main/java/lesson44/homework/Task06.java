package lesson44.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(x -> x % 2 == 0).sorted().forEach(System.out::println);
    }
}
