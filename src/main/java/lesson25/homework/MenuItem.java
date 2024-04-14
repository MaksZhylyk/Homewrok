package lesson25.homework;

public class MenuItem {
    private  String name;
    private  MenuItemType type;

    public MenuItem(String name, MenuItemType type) {
        this.name = name;
        this.type = type;
    }

    public  String getName() {
        return name;
    }

    public  MenuItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "Name - " + name +
                ", Type - " + type +
                "}";
    }
}
