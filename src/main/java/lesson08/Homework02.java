package lesson08;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int result;
        for(int counter = 1; counter <= 10; counter++){
            result = counter * n;
            System.out.println(counter + " * " +  n + " = " + result);

        }
    }
}
