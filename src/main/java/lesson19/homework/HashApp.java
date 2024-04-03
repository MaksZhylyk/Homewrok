package lesson19.homework;

import java.util.HashSet;
import java.util.PropertyPermission;

public class HashApp {

    public static void main(String[] args) {
        HashSet<Property> hashSet = new HashSet<>();
        Property property = new Property("Soborna", "House");
        Property property1 = new Property("Hviezdoslavova", "House");
        Property property2 = new Property("Vaclavske namnesti", "Flat");
        Property property3 = new Property("Vaclavske namnesti", "Flat");
        Property property4 = new Property("Karlovo namnesti", "Flat");
        Property property5 = new Property("Vltavska", "house");
        HashSet<Property> hashSet1 = new HashSet<>();
        hashSet1.add(property3);
        hashSet1.add(property1);
        hashSet1.add(property4);
        hashSet1.add(property5);
        hashSet.add(property);
        hashSet.add(property1);
        hashSet.add(property2);
        hashSet.add(property3);
        System.out.println(hashSet);
        String type = "flat";
        System.out.println(filterByType(hashSet , type));
        System.out.println(compareSets(hashSet , hashSet1));
    }
    private static HashSet<Property> filterByType(HashSet<Property> set, String type){
        HashSet<Property> hashSet1 = new HashSet<>();
    for(Property property : set){
        if(property.getType().equalsIgnoreCase(type)){
             hashSet1.add(property);
        }
    }
    return hashSet1;
    }
    private static HashSet<Property> compareSets(HashSet<Property> hashSet, HashSet<Property> hashSet1){
        HashSet<Property> set = new HashSet<>();
        for (Property property : hashSet1){
            if(!hashSet.contains(property)){
                set.add(property);
            }

        }
        return set;
        /*
          public static void main(String[] args) {
        HashSet<ClothingItem> hashSet = new HashSet<>();
        ClothingItem item1 = new ClothingItem("T - Shirt", "L", "Green", "Outerwear");
        ClothingItem item2 = new ClothingItem("T - Shirt", "M", "Blue", "Outerwear");
        ClothingItem item3 = new ClothingItem("Jeans", "38", "Blue", "underwear");
        ClothingItem item4 = new ClothingItem("Sneakers", "43", "White", "shoes");
        hashSet.add(item1);
        hashSet.add(item2);
        hashSet.add(item3);
        hashSet.add(item4);

    }
         */
    }
}
