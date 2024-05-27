package lesson34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginsCheck {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginsCheck.class);

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            LOGGER.debug("Random number is " + randomNumber);
            if(randomNumber == 50){
                LOGGER.error("Random number is 50");
            }
        }
    }
}
