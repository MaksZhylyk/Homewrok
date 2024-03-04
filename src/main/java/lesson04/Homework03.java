package lesson04;

public class Homework03 {
    /*
    Задача: Объявите две строковые переменные и инициализируйте их названием песни и названием альбома.
     Создайте третью строковую переменную, которая будет содержать полную информацию,
      путем конкатенации (сложения) первых двух переменных. Выведите полную информацию на экран.
     */
    public static void main(String[] args) {
        String songName = "Skillet - Monster";
        String songAlbum = "Awake ";
        String songInfo = songAlbum + songName;
        System.out.println("Информация о песне: " + songInfo);
    }
}
