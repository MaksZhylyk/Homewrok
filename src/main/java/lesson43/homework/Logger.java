package lesson43.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOF_FILE = "src/main/resources/actions.log";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void log(String message){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOF_FILE, true))){
            writer.write(dtf.format(LocalDateTime.now()) + " - " + message);
            writer.newLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
