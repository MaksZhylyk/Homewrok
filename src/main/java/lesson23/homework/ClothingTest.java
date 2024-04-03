package lesson23.homework;

import java.util.HashSet;

public class ClothingTest {
    public static void main(String[] args) {
        HashSet<ClothingItem> hashSet = new HashSet<>();
        ClothingItem item1 = new ClothingItem("T - Shirt", "L", "Green", "Outerwear");
        ClothingItem item2 = new ClothingItem("T - Shirt", "M", "Blue", "Outerwear");
        ClothingItem item3 = new ClothingItem("Jeans", "38", "Blue", "underwear");
        ClothingItem item4 = new ClothingItem("Sneakers", "43", "White", "shoes");
        ClothingManager clothingManager = new ClothingManager(hashSet);
        clothingManager.ClothingAdd(item1);
        clothingManager.ClothingAdd(item2);
        clothingManager.ClothingAdd(item3);
        clothingManager.ClothingAdd(item4);
        System.out.println(clothingManager.findClothing("Jeans"));
        System.out.println("");
        for(ClothingItem clothing : clothingManager.hashSet){
            System.out.println(clothing);
        }
        clothingManager.ClothingRemove("Sneakers");
        System.out.println("");
        for(ClothingItem clothing : clothingManager.hashSet){
            System.out.println(clothing);
        }
    }
}
