package lesson32;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UtilMathString {
    private List<Integer> list = new ArrayList<>();
    public static int max(int a, int b){
        return a>b ? a : b;
    }
    static Stream<String> stringProvider(){
        return Stream.of("apple", "banana", "cherry");
    }

}
