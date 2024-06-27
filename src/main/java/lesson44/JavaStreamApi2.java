package lesson44;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApi2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Golf");
        list.add("Honda");
        list.add("Ford");
        list.add("Mazda");

        Stream stream = list.stream();
        stream.filter(x-> x.toString().length() == 4).forEach(System.out::println);

        /*
        for(String x: list){
            if(x.toString().length() == 4){
                System.out.println(x);
            }
           ^^ - заменяеться одной строкой: x.toString().length() == 4).forEach(System.out::println)
        }*/


        List<String> autoUpperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(autoUpperCase);
    }
}
