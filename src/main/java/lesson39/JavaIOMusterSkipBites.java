package lesson39;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOMusterSkipBites {
    private static final Logger log = LoggerFactory.getLogger(JavaIOMuster.class);

    public static void main(String[] args) {
        try(InputStream inputStream = new FileInputStream("mypassword.txt")){
            inputStream.skip(15);
            int data;
            while((data = inputStream.read()) != -1){
                System.out.println((char)data);
            }
        } catch (FileNotFoundException e){
            log.error(e.getMessage());
        }catch (IOException e){
            log.error(e.getMessage());
        }
    }

}
