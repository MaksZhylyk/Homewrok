package lesson38;

import lesson36.NumberChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    public double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount){
        if(amount < 0){
            LOGGER.error("Amount can't be negative. Amount: {}", amount);
            throw new IllegalArgumentException("Amount can't be negative or 0. Amount: " + amount);

        }
        balance = balance + amount;
        LOGGER.info("Deposit successful. Amount: {}, Balance: {}", amount, balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(balance < amount){
            double shortage = amount - balance;
            LOGGER.error("Insufficient funds. Shortage: {}", shortage);
            throw new InsufficientFundsException(shortage);
        }
        balance = balance - amount;
        LOGGER.info("Withdraw successful. Amount: {}, Balance: {}", amount, balance);
    }
    public static boolean isBankAccountValid(String accountNumber){
        LOGGER.info("Validire Bank account {}", accountNumber);
        accountNumber = accountNumber.trim();
        if(accountNumber.length() != 10){
            LOGGER.error("Da");
        }
        return true;
    }
}
