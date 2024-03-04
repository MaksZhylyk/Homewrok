package lesson05;

public class Operators {
    public static void main(String[] args) {
        // оператор равенства - "=="
        int numberOne = 10;
        int numberTwo = 10;
        System.out.println(numberOne == numberTwo);

        // оператор неравенства - "!="
        int numberThree = 50;
        int numberFour = 60;
        System.out.println(numberThree != numberFour);


        System.out.println(numberThree > numberFour);
        System.out.println(numberThree < numberFour);
        System.out.println(numberOne >= numberTwo);
        System.out.println(numberOne <= numberTwo);

        String nameOne = "Ivan";
        String nameTwo = "Ivan";
        System.out.println(nameOne.equals(nameTwo));

        /*
        AND &&
        false && true --> false
        false && false --> false
        true && false --> false
        true && true --> true
         */

        /*
        OR ||
        false || false --> false
        false || true --> true
        true || false --> true
        true || true --> true
         */

        int age = 20;
        int salary = 10000;
        boolean pass = true;

        boolean hasCredit;
        if (age >= 21 && salary >= 2000 && pass == true) {
            hasCredit = true;
            System.out.println("Positive");
        } else {
            hasCredit = false;
            System.out.println("Negative");
        }
        System.out.println("Credit: " + hasCredit);
        if (age >= 21 || salary >= 2000) {
            hasCredit = true;
        } else {
            hasCredit = false;
        }
        System.out.println("Credit 2: " + hasCredit);


        int a = 4;
        int b = 20;
        boolean checkResult = false;
        if (a > 10 || b > 15) {
            checkResult = true;
        } if(a > 10 && b > 15) {
            checkResult = false;
        }
        System.out.println(checkResult);


    double  accountBalance = 5000.0;
    boolean accountActive = true;
    double amountToWithdraw = 6000.0;
    boolean transactionSuccess = false;
    if(accountActive && accountBalance >= amountToWithdraw) {
        accountBalance = accountBalance = amountToWithdraw;
        transactionSuccess = true;
        System.out.println("Transaction: " + transactionSuccess + "Balance: " + accountBalance);
    }
        else{
            System.out.println("ERROR!!!" + transactionSuccess);
        }
    }
    }
