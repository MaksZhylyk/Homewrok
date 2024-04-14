package lesson25.homework;

public class MenuItemTest {
   private static MenuItem item1 = new MenuItem("Pizza", MenuItemType.DISH);
   private static MenuItem item2 = new MenuItem("Coffee", MenuItemType.DRINK);

    public static void main(String[] args) {
        System.out.println(item1);
        System.out.println(item2);

    }
}
