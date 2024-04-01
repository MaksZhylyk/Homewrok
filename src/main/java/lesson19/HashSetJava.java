package lesson19;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Audi");
        hashSet.add("BMW");
        hashSet.add("VW");

        hashSet.add("Audi");

        if(hashSet.contains("Audi")){
            System.out.println("Element has found");
        }
        System.out.println();
        hashSet.remove("VW");
    }
}
