package lesson38;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankOperations {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankOperations.class);

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0, "12334456678");
        bankAccount.deposit(250);
        bankAccount.deposit(300);
        try {

            bankAccount.withdraw(500);
        } catch (InsufficientFundsException e) {
            LOGGER.error(e.getMessage());
        }
        finally{
            LOGGER.info("Operation was end");
        }
    }
}
