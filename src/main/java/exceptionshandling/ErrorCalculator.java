package exceptionshandling;

import lesson34.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorCalculator {
    private static Animal animal = null;
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);
    public static void main(String[] args) {

        // badMethod();
        divide(10, 0);
    }


   static void badMethod(){
        LOGGER.info("I'm bad method");
        badMethod();
    }


    public static void divide(int a, int b){
       int result = 0;
       try {
            result = a / b;
            animal.getEnergy();
        }
        catch(ArithmeticException exception) {
            LOGGER.error("Divide by zero");
            LOGGER.error((exception.getLocalizedMessage()));
            result = 0;
        }
       catch(NullPointerException exception){
           LOGGER.error("Animal is null");
           LOGGER.error(exception.getLocalizedMessage());
       }

        LOGGER.info("a = {}, b = {}, result: {}", a, b, result);
        LOGGER.info("Divide was finished");
    }
}
