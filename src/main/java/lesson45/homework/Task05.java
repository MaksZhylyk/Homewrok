package lesson45.homework;

import java.util.Arrays;
import java.util.List;

public class Task05 {
    private static List<Integer> numbers = Arrays.asList(5, 13, 1, 21, 8);

    public static void main(String[] args) {
        numbers.stream().filter(x -> x > 10).sorted().forEach(System.out::println);
    }

}
