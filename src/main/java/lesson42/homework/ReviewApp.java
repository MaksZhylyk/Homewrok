package lesson42.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReviewApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//считываем через сканнер

        try (FileWriter writer = new FileWriter("reviews.txt", true)) {//добавляем записи в файл
            boolean addMore = true;//создали переменную

            while (addMore) {
                System.out.print("Введите имя путешественника: ");
                String travelerName = scanner.nextLine();
                System.out.print("Введите страну посещения: ");
                String country = scanner.nextLine();
                System.out.print("Введите отзыв: ");
                String reviewText = scanner.nextLine();
                System.out.print("Введите дату посещения: ");
                String visitDate = scanner.nextLine();


                //форма/последовательность записи
                Review review = new Review(travelerName, country, reviewText, visitDate);
                writer.write(review.toString() + "\n");

                System.out.print("Хотите добавить еще отзывы? (да/нет): ");
                String response = scanner.nextLine();
                addMore = response.equalsIgnoreCase("да");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

