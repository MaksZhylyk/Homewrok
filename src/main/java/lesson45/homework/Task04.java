package lesson45.homework;

import java.util.Arrays;
import java.util.List;

public class Task04 {
   private static List<String> tools = Arrays.asList("hammer", "jack", "wrench");

    public static void main(String[] args) {
        tools.stream().filter(x -> x.startsWith("j")).forEach(System.out::println);
    }


}
