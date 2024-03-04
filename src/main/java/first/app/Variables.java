package first.app;

public class Variables {
    //1byte - -128 до 127(размер)
   static byte age = 18;
    //1short - -32768 do 32767, 2byte
    static short price = 10000;

    //1int - -2147483648 do 2147483647, 4byte
    static int number = 200000;

    //1long - -9223372036854775808 do 9223372036854775807, 8byte, the letter L closes, не считает числа после "," 0.85=0
    static long bigNumber = 31532671373713745L;
    //float - работа с дробями, the letter F closes
    static float euroPrice = 0.85F;

    //double - работа с дробями
    static double dollarPrice = 0.85;

   //char - symbols
    static char charLetter = 'A';

    //boolean - только да или нет, если не указать true/false результат будет false
    static boolean result;

    static String text = "Hello ";



    public static void main(String[] args) {
        System.out.println("Возраст " + age);
        System.out.println("Цена " + price);
        System.out.println("Число " + number);
        System.out.println("Бюджет США " + bigNumber);
        System.out.println("Курс евро к доллару " + euroPrice);
        System.out.println("Бутылка воды " + dollarPrice);
        System.out.println("Буква " + charLetter);
        System.out.println("Беременность " + result);
        System.out.println("Приветствие " + text);
    }
}
