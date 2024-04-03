package lesson23.homework;

import java.util.Objects;

public class ClothingItem {
    private String name;
    private String size;
    private String color;
    private String category;

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothingItem that = (ClothingItem) o;
        return Objects.equals(size, that.size) && Objects.equals(color, that.color) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ClothingItem(String name, String size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }
}
