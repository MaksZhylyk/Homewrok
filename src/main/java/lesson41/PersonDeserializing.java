package lesson41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class PersonDeserializing {

    private static final Logger log = LoggerFactory.getLogger(PersonDeserializing.class);

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("src/main/resources/person.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis)) {
          Person personJackieChan = (Person) objectInputStream.readObject();
                log.info("personJackieChan: {}", personJackieChan);
            }catch(FileNotFoundException e){
            log.error(e.getMessage(),e);
    } catch (IOException e){
            log.error(e.getMessage(), e);
        } catch(ClassNotFoundException e){
            log.error(e.getMessage(), e);
        }

    }
}
