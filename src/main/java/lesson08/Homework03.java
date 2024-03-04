package lesson08;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int sum = 0;

        for( int counter = 0; counter <=n; counter++){
            sum += counter;
        }
        System.out.println(sum);
    }
}
