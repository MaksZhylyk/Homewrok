package lesson43.homework;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Scanner;

public class Main {
    private static AuthenticationManager authenticationManager;
    private static CountryManager countryManager;
    private static User user;
    private static Logger log;
    private static Country country;

    public static void main(String[] args) {
        try{
            authenticationManager = new AuthenticationManager("src/main/resources/user.txt");
            countryManager = new CountryManager("src/main/resources/country.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваш лоигн: ");
            String username = scanner.nextLine();
            System.out.println("Введите ваш пароль: ");
            String password = scanner.nextLine();

            user = authenticationManager.authentication(username, password);

            if(user == null){
                System.out.println("Введен неверный логин или пароль");
                return;
            }
            System.out.println("Добро пожаловать, " + user.getUsername() + "!" );
            Logger.log("Пользователь: " + user.getUsername() + " успешно вошел в систему");
            boolean exit = false;

            while(!exit) {
                System.out.println("Выберите действие:");
                System.out.println("1. Просморт информации о странах");
                if (user.getRole().equals("admin")) {
                    System.out.println("2. Добавление новой страны");
                    System.out.println("3. Обновление информации о стране");
                    System.out.println("4. Удаление страны");
                }
                    System.out.println("5. Выход");
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        viewCountries();
                        break;
                    case 2:
                        if (user.getRole().equals("admin")) {
                            addCountry(scanner);
                        } else {
                            System.out.println("У вас недостаточно прав.");
                        }
                        break;
                    case 3:
                        if (user.getRole().equals("admin")) {
                            updateCountry(scanner);
                        } else {
                            System.out.println("У вас недостаточно прав.");
                        }
                        break;
                    case 4:
                        if (user.getRole().equals("admin")) {
                            deleteCountry(scanner);
                        } else {
                            System.out.println("У вас недостаточно прав.");
                        }
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Ошибка, попробуйте снова");
                }
                if(user.getRole().equals("admin")){
                    Logger.log("Администратор: " + user.getUsername() + " выбрал действие: " + choice );
                } else{
                    Logger.log("Пользователь: " + user.getUsername() + " выбрал действие: " + choice );
                }
                }
            scanner.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static void viewCountries(){
        for(Country country : countryManager.getCountries()){
            System.out.println(country);
        }
    }

    private static void addCountry(Scanner scanner) throws IOException{
        System.out.println("Введите название страны: ");
        String name = scanner.nextLine();
        System.out.println("Введите название сстолицы: ");
        String capital = scanner.nextLine();
        System.out.println("Введите количество населения: ");
        long population = scanner.nextLong();
        System.out.println("Введите площадь: ");
        double area = scanner.nextDouble();

        Country country = new Country(name, capital, population, area);
        countryManager.addCountry(country);
        System.out.println("Страна добавлена.");
        Logger.log("Администратор: " + user.getUsername() + " добавил страну: " + country.getName());
    }

    private static void updateCountry(Scanner scanner) throws IOException{
        System.out.println("Введите новое название страны: ");
        String name = scanner.nextLine();
        System.out.println("Введите новое название столицы: ");
        String capital = scanner.nextLine();
        System.out.println("Введите новое количество населения: ");
        long population = scanner.nextLong();
        System.out.println("Введите новую площадь: ");
        double area = scanner.nextDouble();

        Country country = new Country(name, capital, population, area);
        countryManager.addCountry(country);
        System.out.println("Информация о стране," + country.getName() + " обновлена");
        Logger.log("Администратор: " + user.getUsername() + " обновил информацию о стране: " + country.getName());
    }
    private static void deleteCountry(Scanner scanner) throws IOException {
        System.out.println("Введите новое название страны: ");
        String name = scanner.nextLine();
        countryManager.deleteCountry(name);
        System.out.println("Страна успешно удалена.");
        Logger.log("Администратор: " + user.getUsername() + " удалил страну: " + country.getName());

    }

}
