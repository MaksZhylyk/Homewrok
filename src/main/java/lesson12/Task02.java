package lesson12;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = isEven(12);
        System.out.println(result);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

}
