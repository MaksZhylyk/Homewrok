package lesson39.homework;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    private static final Logger log = LoggerFactory.getLogger(CharacterCount.class);

    public static void main(String[] args) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        try (FileInputStream inputStream = new FileInputStream("sample.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                char ch = (char) data;
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) +1);
            }

        } catch (FileNotFoundException e){
            log.error(e.getMessage());
        }
        catch (IOException e){
            log.error(e.getMessage());
        }
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
