package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task07 {
    private static List<Integer> values = Arrays.asList(2, 3, 5, 7, 11);

    public static void main(String[] args) {
        Optional<Integer> sum = values.stream().reduce((y,x) -> x+y);
        System.out.println(sum);
    }

}
