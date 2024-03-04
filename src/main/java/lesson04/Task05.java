package lesson04;

public class Task05 {
    static double firstSong = 120;
    static double secondSong = 120;
    static double thirdSong = 240;
    static double sumTimeSec = (firstSong + secondSong + thirdSong);
    static double minute1 = firstSong/60;
    static double minute2 = secondSong/60;
    static double minute3 = thirdSong/60;

    public static void main(String[] args) {
        System.out.println("Средняя продолжительность песен: " + sumTimeSec);
        System.out.println("Первая песня: " + minute1);
        System.out.println("Вторая песня: " + minute2);
        System.out.println("Третья песня: " + minute3);

    int firstSong = 100;
    int minutesFirstSong = firstSong/60;
    int secondsFirstSong = firstSong - minutesFirstSong*60;
    System.out.println("Минуты: " + minutesFirstSong + " Секунды: " + secondsFirstSong);
    }
}
