package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task08 {
    private static List<Integer> stats = Arrays.asList(10, 20, 30, 40, 50);

    public static void main(String[] args) {
        Optional<Integer> minNumber = stats.stream().min(Integer::compareTo);
        System.out.println(minNumber);
        Optional<Integer> maxNumber = stats.stream().max(Integer::compareTo);
        System.out.println(maxNumber);
    }

}
