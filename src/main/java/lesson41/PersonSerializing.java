package lesson41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class PersonSerializing {
    private static final Logger log = LoggerFactory.getLogger(PersonSerializing.class);
    public static void main(String[] args) {
        Person person = new Person("Jackie Chan", 70, true);
        try(FileOutputStream fos = new FileOutputStream("src/main/resources/person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)){
            objectOutputStream.writeObject(person);
            log.info("Person serialized successfully");
        }catch(FileNotFoundException e){
            log.error(e.getMessage(), e);
        } catch (IOException e){
            log.error(e.getMessage(), e);
        }

    }
}
