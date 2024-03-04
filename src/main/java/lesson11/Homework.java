package lesson11;

import java.util.Scanner;

public class Homework {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите марку автомобиля");
        String carBrand = scanner.next().trim();
        System.out.println("Введите год выпуска");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка");
            scanner.next();
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()){
            case "ford":
                countryOfOrigin = "Амерыка";
                if (year >=1903 && year < 2000){
                    carInfo = "Самая популярная модель - Мустанг, очень популярными остаются автомобили марки Линкольн";
                } else if (year >= 2000 && year <= 20024){
                    carInfo = "Внедорожники теряют свою популярность, в моду входят небольшие седаны";
                } else if(year > 2024) {
                    carInfo = "Введенный год еще не наступил((";
                }
                else {
                    carInfo = "Компания Форд не существовала";
                }
                    break;
            case "bmw":
                countryOfOrigin = "Germany";
                if(year < 2000 && year >=1916){
                    carInfo = "БМВ перешли от самолетов к машинам и мотоциклам";
                } else if (year >= 2000 && year <=2024){
                    carInfo = "Компания БМВ является одним из лучших производителем автомобилей в мире";
                }
                else if(year >2024){
                    carInfo = "Введенный год еще не наступил((";
                }
                else {
                    carInfo = ("Компания БМВ была основана позже");
                }
                break;
            default: carInfo = "Информация о данном автомобиле не найдена";
            countryOfOrigin = "Информации нет";
            break;
        }
        CarDatabase(countryOfOrigin, carInfo);
    }
    public static void CarDatabase(String country, String info){
        System.out.println("Страна производитель: " + country);
        System.out.println("Дополнительная информация: " + info);
    }
}


