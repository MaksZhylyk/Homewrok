package lesson35;

import exceptionshandling.ErrorCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DrinksCheck {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinksCheck.class);
    private static Scanner scanner = new Scanner(System.in);
    private static String[] drinks ={"Кофе", "Чай", "Сок"};

    public static void main(String[] args) {
        LOGGER.info("Введите название напитка:" +
                 "\n0 - Коффе       1 - Чай        2 - Сок");
       try {
           int numberOfDrink = scanner.nextInt();
           if (numberOfDrink > 0 && numberOfDrink < 2) {
               LOGGER.info("Ваш напиток готовиться");
           } else {
               try {
                   for (int i = 0; i < 3; i++) {
                       String drink = drinks[numberOfDrink];

                   }


               } catch (ArrayIndexOutOfBoundsException exception) {
                   LOGGER.error("Введенно неверное число");
                   LOGGER.error(exception.getLocalizedMessage());
               }
           }
       } catch (InputMismatchException exception){
            LOGGER.error("Введено нецелое число");
            LOGGER.error(exception.getLocalizedMessage());
        }
       finally {
           LOGGER.info("Программа окончена, спасибо!");

           scanner.close();

       }
    }


}
