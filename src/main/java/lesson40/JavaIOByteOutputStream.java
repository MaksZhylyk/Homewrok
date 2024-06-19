package lesson40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class JavaIOByteOutputStream {
    private static final Logger log = LoggerFactory.getLogger(JavaIOOutput.class);
    public static void main(String[] args) {
        String test = "Hello Java 2024!!!";
        byte[] bytes = test.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try{
            byteArrayOutputStream.write(bytes);
        } catch (IOException e){
            log.error(e.getMessage());
        }
        finally {
            if(byteArrayOutputStream != null){
                try{
                    byteArrayOutputStream.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println(byteArrayOutputStream.toByteArray());
        for(byte b : byteArrayOutputStream.toByteArray()){
            System.out.println((char) b);
        }
       try( FileOutputStream fileOutputStream = new FileOutputStream("fileOutput.txt")){
           byteArrayOutputStream.writeTo(fileOutputStream);
       } catch (FileNotFoundException e){
           throw new RuntimeException(e);
       } catch (IOException e){
           throw new RuntimeException(e);
       }
    }
}
