package lesson15;

public class Task02 {
    public static int calculateDifference(int x, int y){
        int difference = x-y;
        return difference;
    }

    public static void main(String[] args) {
        System.out.println("Проверка работы методов");
        int result = calculateDifference(10, 5);
        System.out.println("Разность чисел: " + result);
        int[] data = {1, 2, 3, 4};
        printArray(data);
        int multiplicationResult = multiply(5, 0);
        System.out.println("Произведение чисел: " + multiplicationResult);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элементы массива: " + array[i]);
        }
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}
