package lesson39.homework;

import lesson39.JavaIOMuster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TextAnalyser {
    private static final Logger log = LoggerFactory.getLogger(TextAnalyser.class);
    public static void main(String[] args) {
        String textFilePath = "src/main/resources/text.txt";
        Map<Character, Integer> textToAnalyse = new HashMap<>();
        try(InputStream inputStream = new FileInputStream(textFilePath)){
            int ch;
            while((ch = inputStream.read()) != -1){
                System.out.println();
            }
        } catch (FileNotFoundException e){
            log.error(e.getMessage());
        } catch (IOException e){
            log.error(e.getMessage());
        }
    }
}
