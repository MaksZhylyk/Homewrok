package lesson40;

import java.io.ByteArrayInputStream;

public class JavaIOByteInputStream {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int data;
        while((data = byteArrayInputStream.read()) != -1){
            System.out.println(data);

        }
        System.out.println("-----------");
        String test = "Hello Java 2024!!!";
        byte[] byteArray = test.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray);
        int dataText;
        while((dataText = byteArrayInputStream1.read()) != -1){
            System.out.println((char) dataText);
        }
    }
}
