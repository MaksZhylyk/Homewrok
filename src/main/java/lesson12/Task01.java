package lesson12;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расширение фала");
        String file = scanner.next().trim();
        String fileType = "Ничего";
        switch(file.toLowerCase()){
            case "pdf":
                fileType = "Документ";
                break;
            case "docx":
                fileType = "Документ (вордовский)";
                break;
            case "jpg":
                fileType = "Фотография";
                break;
            default:
                fileType = "Информация о данном файле недоступна";
        }
        System.out.println(fileType);

    }
}
