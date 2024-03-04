package lesson14;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] hobby = {"рисование", "волейбол", "шахматы"};
        System.out.println("Список хобби: ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(i + 1 + "." + hobby[i]);
        }
        String lookingForHobby = "велоспорт";
        boolean isHobby = false;
        for (int i = 0; i < hobby.length; i++) {
            if (lookingForHobby == hobby[i]) {
                isHobby = true;
            }
        }
        if (isHobby) {
            System.out.println("Ваше хобби есть в списке");
        } else {
            System.out.println("Вашего хобби нет в списке");
        }
            String[] hobby1 = new String[hobby.length + 1];
            for (int i = 0; i < hobby.length; i++) {
                hobby1[i]=hobby[i];

            }
            hobby1[hobby1.length-1]="плаванье";
            System.out.println(Arrays.toString(hobby1));

        System.out.println("Введите номер вашего любимого хобби");
        int hobbyTitle = scanner.nextInt();
        while (true) {
            if (hobbyTitle > 3 || hobbyTitle < 1) {
                System.out.println("Вы ввели неверный номер хобби, попробуйте ещё раз");
                hobbyTitle = scanner.nextInt();

                for (int i = 0; i < hobby.length; i++) {
                    if (hobbyTitle == i + 1) {
                        System.out.println(hobby[i]);
                    }
                }
            }
        }
    }
}

