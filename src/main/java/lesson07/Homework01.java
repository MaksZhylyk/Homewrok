package lesson07;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        if(age > 0 && age < 12){
            System.out.println("Вы ребенок");
        }
        else if (age >= 12 && age < 18) {
            System.out.println("Вы подросток");
        }
        else if ( age >= 18 && age < 60){
            System.out.println("Вы взрослый");
        }
        else{
            System.out.println("Вы старик");
        }
    }
}
