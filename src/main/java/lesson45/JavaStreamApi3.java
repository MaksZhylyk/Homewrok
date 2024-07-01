package lesson45;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApi3 {
    private static List<String> carList = new ArrayList<>();

    public static void main(String[] args) {
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Golf");
        carList.add("Honda");
        carList.add("Ford");
        carList.add("Mazda");
        System.out.println(carList.stream().count());

        List<Integer> elementsInt = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> sum = elementsInt.stream().reduce((y, x) -> y + x);

        System.out.println(sum.get());

        Optional<Integer> resultMinElement = elementsInt.stream().min(Integer::compareTo);
        System.out.println(resultMinElement.get());

        Optional<Integer> resultFinstFirst = elementsInt.stream().filter(x -> x > 5).findFirst();
        System.out.println(resultFinstFirst.get());

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 12);

        numbers.stream().skip(2).forEach(System.out::println);

        numbers.stream().limit(3).forEach(System.out::println);

        boolean match = numbers.stream().anyMatch(x -> x > 0);
        boolean anyMatch = numbers.stream().anyMatch(x -> x%2 == 0);

        List<String> list1 = Arrays.asList("apple", "banana");
        List<String> list2 = Arrays.asList("cherry", "date");

        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);

        List<String> words = Arrays.asList("apple", "banana", "fig", "date");

        Map<Boolean, List<String>> collected = words.stream().collect(Collectors.partitioningBy(word -> word.length() <5));
        System.out.println(collected);




    }
}
