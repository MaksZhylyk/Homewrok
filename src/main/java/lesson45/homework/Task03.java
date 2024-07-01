package lesson45.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task03 {
    private static List<String> words = Arrays.asList("stream", "api", "java", "list");

    public static void main(String[] args) {
        System.out.println(words.stream().filter(x -> x.length() > 4).count());

    }

}
