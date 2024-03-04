package lesson06;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели число: " + a);
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели число: " + b);
        int c = a + b;
        System.out.println("Сумма двух чисел = " + c);

    }

}
