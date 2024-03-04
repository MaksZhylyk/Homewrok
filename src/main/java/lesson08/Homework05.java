package lesson08;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        printGreeting();
        String studentName = null;
        double group = 0;
        printGreetingStudent("Anna");
        printGreetingStudent("Anna", group = 42.2);
    }
    public static void printGreeting(){
        System.out.println("Hello");
    }
    public static void printGreetingStudent(String studentName){
        System.out.println("hello" + studentName);
    }
    public static void printGreetingStudent(String studentName, double group){
        System.out.println("hello " + studentName + " your group " + group);
    }
}
