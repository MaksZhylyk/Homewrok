package lesson08;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        long n = scanner.nextLong();
        String p = Long.toString(n);
        long a = p.length();
        long b = 0;
        long sum = 0;
        for (int i = 0; i < a; i++) {
            b = n % 10;
            sum += b;
            n /= 10;
        }


        System.out.println(sum);
    }
}
