package lesson05;

public class Homework {
    public static void main(String[] args) {
       /*
       Напишите программу, которая сравнивает два введенных числа a и b. Программа должна выводить:

"a больше b", если a > b
"a меньше b", если a < b
"a равно b", если a и b равны
        */
        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("a more then b");
        }
        if (a < b) {
            System.out.println("a less then b");
        }
        if (a == b) {
            System.out.println("a equal b");
        }
        /*
        Даны три целых числа x, y и z. Напишите программу, которая проверяет, лежит ли y между x и z.
        Ваша программа должна выводить true, если y находится между x и z, и false в противном случае.
         */
        int x = 30;
        int y = 20;
        int z = 40;
        if (y > x && y < z) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        /*
        Напишите программу, которая проверяет,
         соответствует ли введенный возраст условиям для получения водительских прав.
          В разных странах возраст, когда можно начать учиться водить машину, может отличаться.
           Пусть в вашей программе минимальный возраст будет 16 лет, а максимальный – 75 лет.
           Программа должна выводить true, если возраст соответствует условиям, и false – если нет.
         */
        int myAge = 18;
        int minAge = 16;
        int maxAge = 75;
        if (myAge >= minAge && myAge <= maxAge) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /*
        Напишите программу, которая оценивает результаты теста.
         Пусть результат теста хранится в переменной score.
          Если score больше или равно 90, выведите "Отлично", если score между 70 и 89 – выведите "Хорошо",
           если между 50 и 69 – "Удовлетворительно", и "Неудовлетворительно" во всех остальных случаях.
         */
        int score = 74;
        if (score >= 90) {
            System.out.println("Отлично");

        }
        if (score >= 70 && score <= 89) {
            System.out.println("Хорошо");

        }
            if (score >= 50 && score <= 69) {
                System.out.println("Удовлетворительно");
            }
            else{
                if(score <= 49){
                    System.out.println("Неудовлетворительно");
                }


        }
    }
}




