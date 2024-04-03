package lesson23;

import java.util.HashSet;
import java.util.Scanner;

public class MovieCatalog {
    public static void main(String[] args) {
        HashSet<Movie> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        Movie movie1 = new Movie("Титанк", "Романтика", 1997);
        Movie movie2 = new Movie("Титанк", "Романтика", 1997);
        Movie movie3 = new Movie("Зеленая миля", "Драма", 1999);
        Movie movie4 = new Movie("Я - легенда", "Фэнтези", 2007);
        Movie movie5 = new Movie("Дюна", "Фэнтези", 2021);

        hashSet.add(movie1);
        hashSet.add(movie2);
        hashSet.add(movie3);
        hashSet.add(movie4);
        hashSet.add(movie5);
        System.out.println(hashSet);
        System.out.println("Добавить фильм?" + "\n 1. Да.   2. Нет");
        int a = scanner.nextInt();

            System.out.println("Введите название:");
            String film = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Введите жанр:");
            String genre = scanner.nextLine();
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            Movie movie6 = new Movie(film, genre, year);
            hashSet.add(movie6);
            System.out.println(hashSet);

    }
}

