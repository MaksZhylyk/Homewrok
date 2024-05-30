package lesson36;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException {
        NumberChecker numberChecker = new NumberChecker();
        try{
            NumberChecker.checkNumber();
        } catch (InputMismatchException exception){

            throw new InputMismatchException("Введенно неверное значение");
        }
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        try{
            ExceptionPropagation.method1();
        } catch (Exception exception){
            throw new IOException("ERROR!!!");
        }
    }
}
