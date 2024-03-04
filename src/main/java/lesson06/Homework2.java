package lesson06;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую оценку: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели первую оценку: " + a);
        System.out.println("Введите вторую оценку: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели вторую оценку: " + b);
        System.out.println("Введите третью оценку: ");
        int c = scanner.nextInt();
        System.out.println("Вы ввели третью оценку: " + c);
        System.out.println("Введите четвертую оценку: ");
        int d = scanner.nextInt();
        System.out.println("Вы ввели четвертую оценку: " + d);
        System.out.println("Введите пятую оценку: ");
        int e = scanner.nextInt();
        System.out.println("Вы ввели пятую оценку: " + e);
        double sum = (double) (a + b + c + d + e)/5;
        System.out.println("Средний балл = " + sum);

    }
}
