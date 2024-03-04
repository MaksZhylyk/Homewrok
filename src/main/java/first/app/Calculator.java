package first.app;

public class Calculator {
    static int numberOne = 100;

    static int numberTwo = 50;

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(a + b);
      System.out.println(addition(numberOne, numberTwo));
      System.out.println(multiplication(numberOne, numberTwo));
    }

    public static int addition(int firstNumber , int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;




    }
}
