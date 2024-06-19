package lesson40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOOutput {
    private static final Logger log = LoggerFactory.getLogger(JavaIOOutput.class);
    public static void main(String[] args) {
        String text = "Java IO output";
        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            byte[] bytes = text.getBytes();
            fos.write(bytes, 0, bytes.length);
            fos.write(bytes[0]);
            log.info("Written output to file: {}", text);
        } catch(FileNotFoundException e){
            log.error(e.getMessage());
        } catch (IOException e){
            log.error(e.getMessage());
        }
    }
}
