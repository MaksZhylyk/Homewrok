package lesson06;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара: ");
        double price = scanner.nextDouble();
        System.out.println("Вы ввели цену товара:" + price);
        System.out.println("Введите регион: 1 - A, 2 - B");
        double a = scanner.nextDouble();
        System.out.println("Вы ввели регион - " + a);
        System.out.println("Введите категорию товара:  1 - электроника, 2 - одежда");
        double b = scanner.nextDouble();
        System.out.println("Вы ввели категорию товара - " + b);
        double totalPrice = 0;
        double electronic = price * 0.1;
        double clothes = price * 0.05;
        double region = price * 0.02;
        if (a == 1 && b == 1){
        totalPrice = price + region + electronic;
        }
        if(a == 2 && b ==1) {
            totalPrice = price + electronic;
        }
        if(a == 1 && b ==2) {
            totalPrice = price + region + clothes;
        }
        if(a == 2 && b ==2) {
            totalPrice = price + clothes;
        }


        System.out.println("Цена товара учитывая налог: " + totalPrice);


    }
}
