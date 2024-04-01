package lesson15;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10, b = 1;
        int divisionResult = divide(a , b);
        System.out.println("Результат деления: " + divisionResult);
        int c = scanner.nextInt();
        System.out.println("Значение с: " + c);
        String massage = "Hello, world!";
        if(massage.equals("Hello, world!")){
            System.out.println("Приветсвие обнаружено");
        } else {
            System.out.println("Приветствие необнаружен");
        }
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Число: " + numbers[i]);
        }
        if(isEven(a)){
            System.out.println(a + " - четное число.");
        } else {
            System.out.println(a + " - нечетное число.");
        }
    }
    public static int divide(int x, int y){
        if (y == 0){
            return - 1;
        }
        return x/y;
    }
    private static boolean isEven(int number){
        return number % 2 == 0;
    }
}
