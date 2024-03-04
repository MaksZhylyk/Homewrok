package lesson07;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ответьте на 3 вопроса, что бы узнать свой уровень знаний в программировании");
        int score = 0;
        System.out.println("1. Может ли переменная short работать с дробямия?" + "\n1) Да.    2) Нет.");
        int answer1 = scanner.nextInt();
        if(answer1 == 2){
            score++;
        }
        System.out.println("2. Выберите наимение используемый оператор:" + "\n1) +.     2) %.      3) ^.");
        int answer2 = scanner.nextInt();
        if(answer2 == 3){
            score++;
        }
        System.out.println("Введите название переменной неиспользующей цифры");
        String answer3 = scanner.next();
        if(answer3.equals("String")  || answer3.equals("boolean") || answer3.equals("char")){
            score++;
        }
        System.out.println("Вы завершили тест, ваш результат:");
        if( score >= 2 ){
            System.out.println("Вы хорошо знаете программирование!");
        }
        else if(score <= 1){
            System.out.println("Вам нужно учиться больше!");
        }
    }
}
