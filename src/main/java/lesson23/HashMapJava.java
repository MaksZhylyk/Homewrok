package lesson23;

import java.util.HashMap;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Germany");
        hashMap.put("BMW", "Germany");
        hashMap.put("Toyota", "Japan");

        if(hashMap.containsKey("Audi")){
            System.out.println("Audi was found");
        }

        if(hashMap.containsValue("Germany")){
            System.out.println("Germany was found");
        }
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
    }
}
