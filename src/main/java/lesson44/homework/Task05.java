package lesson44.homework;

import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, 3, 4);
        numbers.stream().filter(x -> x < 0).forEach(System.out::println);

    }

}
