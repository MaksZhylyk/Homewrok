package lesson36;

import exceptionshandling.CheckedExceptionsMaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;



public class NumberChecker {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberChecker.class);
    private static Scanner scanner = new Scanner(System.in);

    public static void checkNumber() throws InputMismatchException {
        System.out.println("Введите число");
        int number = scanner.nextInt();
    }
}
