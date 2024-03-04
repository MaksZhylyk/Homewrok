package lesson06;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели число: " + a);
        if(a % 2 == 0){
            System.out.println("Число " + a + " - четное");
        }
        else {
            System.out.println("Число " + a + " - нечетное");
        }
    }

}
