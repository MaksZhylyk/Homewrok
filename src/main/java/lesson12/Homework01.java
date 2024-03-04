package lesson12;

public class Homework01 {

    public static void main(String[] args) {
        double area = calculateArea(7, 8);
        double perimeter = calculatePerimeter(7, 8);
        System.out.println("Площадь = " + area + "\nПериметр = " + perimeter);


    }
    public static double calculateArea(double a, double b){
        return a * b;
    }
    public static double calculatePerimeter(double a, double b){
        return 2*(a + b);
    }
}
