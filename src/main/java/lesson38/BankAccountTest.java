package lesson38;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class BankAccountTest {
    private BankAccount account;
    void setUp(){
        account = new BankAccount(0, "1234567890");
    }
    @Test
    void testBalanceAddAmountPositive(){
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }
    void testBalanceAddNegativeThrowException(){
        assertThrows(IllegalArgumentException.class, ()->
                account.deposit(-1000));
    }
}
