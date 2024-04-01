package lesson10;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOperation = true;
        while (continueOperation) {
            System.out.println("Выберите операцию\n" +
                    "1. +   2. -    3. *    4. /");

            int operation = scanner.nextInt();
            System.out.println("Введите 2 числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = 0;
            if (operation == 4 && b == 0) {
                System.out.println("Делить на ноль нельзя");
                b = scanner.nextInt();
            }
            if (operation == 1) {
                result = a + b;
            } else if (operation == 2) {
                result = a - b;
            } else if (operation == 3) {
                result = a * b;
            } else if (operation == 4) {
                result = a / b;
            } else {
                System.out.println("Операция не выбрана");
            }
            System.out.println("Продолжим?\n" +
                    "1. Да   2. Нет");
            int next = scanner.nextInt();
            if (next == 2) {
                continueOperation = false;
                System.out.println("Результат: " + result);
            }



        }
        
    }
}

