package lesson42.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class BookingApp {
    private static final Logger log = LoggerFactory.getLogger(BookingApp.class);
    public static void main(String[] args) {
        File file = new File("src/main/resources/bookings.txt");
         try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/bookings.txt"))){
             String line;
             while((line = bufferedReader.readLine()) != null){
                 String[] parts = line.split(",");
                 if(parts.length == 5){
                     String customerName = parts[0].trim();
                     int hotelNumber = Integer.parseInt(parts[1].trim());
                     String roomType = parts[2].trim();
                     String checkInDate = parts[3].trim();
                     String checkOutDate = parts[4].trim();

                     Booking customer = new Booking(customerName, hotelNumber, roomType, checkInDate, checkOutDate);
                     System.out.println(customer);
                 } else {
                     System.out.println("Ошибка в данных " + line);
                 }


             }
         } catch (FileNotFoundException e){
             log.error("File not found" + e.getMessage());
         } catch (IOException e){
             log.error("IO exception " + e.getMessage());
         }
    }
}
