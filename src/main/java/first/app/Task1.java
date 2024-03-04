package first.app;

public class Task1 {
    static String firstName = "Harry ";
    static String secondName = "Potter";
    public static void main(String[] args) {
        System.out.println(fullName(firstName, secondName));

    }
    public static String fullName(String firstName, String secondName){
        return firstName + secondName;
    }
}
