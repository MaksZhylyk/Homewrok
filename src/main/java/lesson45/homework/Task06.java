package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task06 {
    private static List<String> animals = Arrays.asList("ant", "bear", "alligator");

    public static void main(String[] args) {
        Map<Boolean, List<String>> sortedAnimals = animals.stream().collect(Collectors.partitioningBy(words -> words.startsWith("a")));
        System.out.println(sortedAnimals);

    }

}
