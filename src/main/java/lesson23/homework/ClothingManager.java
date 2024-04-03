package lesson23.homework;

import java.util.HashSet;

public class ClothingManager {
    HashSet<ClothingItem> hashSet;
    public boolean ClothingAdd(ClothingItem clothingItem){
        return clothingItem != null && hashSet.add(clothingItem);

    }
    public ClothingItem ClothingRemove(String name){
        ClothingItem clothingItem1 = findClothing(name);
        if(clothingItem1 != null){
            hashSet.remove(clothingItem1);
            return clothingItem1;
        }
        return null;
    }

    public ClothingItem findClothing(String name) {
        for (ClothingItem clothing : hashSet ) {
            if (clothing.getName() == name) {
                return clothing;
            }
        }
        return null;
    }

    public ClothingManager(HashSet<ClothingItem> hashSet) {
        this.hashSet = hashSet;
    }
}
