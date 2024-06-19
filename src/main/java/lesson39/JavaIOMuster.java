package lesson39;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOMuster {
    private static final Logger log = LoggerFactory.getLogger(JavaIOMuster.class);

    public static void main(String[] args) {
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("mypasswords.txt");
            int data;
            while((data = inputStream.read()) != -1){
                System.out.println(new String(Character.toChars(data)));

            }
        } catch (FileNotFoundException e){
            log.error("File not found", e.getMessage());
        } catch (IOException e){
            log.error("I/O error", e.getMessage());
        } finally{
            try{
                inputStream.close();
            } catch(NullPointerException e){
                log.error("NullPointerException", e.getMessage());
            } catch (IOException e){
                log.error("I/O exception", e.getMessage());
            }
        }
    }
}
