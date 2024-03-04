package lesson06;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Часы: ");
        int hours = scanner.nextInt();
        System.out.println("Минуты: ");
        int minutes = scanner.nextInt();
        if(minutes < 10){
            System.out.println("Ваше время: " + hours + ":0" + minutes);
        }
       else {
            System.out.println("Ваше время: " + hours + ":" + minutes);
        }
        if(minutes >= 0 && minutes <= 45 && hours >= 8 && hours < 13){
            System.out.println("Урок");}
            else if(minutes > 45 && minutes < 60 && hours >= 8 && hours < 13){
            System.out.println("Перемена");
        }
           else if(hours == 13 && minutes <= 30){
                System.out.println("Обед");
            }
           if(hours == 13 && minutes > 30 && minutes < 60 || hours > 13 && minutes < 60 || hours < 8 && minutes < 60 ){
               System.out.println("Cвободное время");
           }
            if(minutes >= 60 || hours >= 24){
                System.out.println("Введено неправильное время :(");
            }
    }
}
