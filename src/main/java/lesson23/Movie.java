package lesson23;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Movie {
    /*
    **Задача**: Создать программу для управления каталогом фильмов
 в кинотеатре. Каждый фильм в каталоге должен быть
  уникальным и характеризоваться названием, годом выпуска и жанром.
   Необходимо реализовать возможность добавления фильмов в каталог,
   исключая возможность добавления дубликатов,
    и предоставить функцию вывода всего каталога фильмов.
     */
    private String film;
    private String genre;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(film, movie.film) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film, genre, year);
    }

    @Override
    public String toString() {
        return "\nФильм = " + film + "\nЖанр = " + genre + "\nГод = " + year + "\n" + "\n";
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Movie(String film, String genre, int year) {
        this.film = film;
        this.genre = genre;
        this.year = year;
    }

}
