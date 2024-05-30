package lesson36;

import java.io.IOError;
import java.io.IOException;

public class ExceptionPropagation {
    public static void method1() throws IOException{
        method2();
    }

    private static void method2() throws IOException {
        method3();
    }

    private static void method3() throws IOException {
        throw new IOException("exception");

    }


}
