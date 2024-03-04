package first.app;

//public --> модификатор доступа, класс общедоступный
public class MyApp {
 //1byte - -128 до 127(размер)
    byte age = 18;

    //1short - -32768 do 32767 2byte
    short price = 10000;

    //1int - -2147483648 do 2147483647 4byte
    int number = 200000;

    //1long - -9223372036854775808 do 9223372036854775807, 8byte, the letter L closes
    long bigNumber = 31532671373713745L;
    /*    #    <    >    +    -    ,    .     :    ;   (    )   {   }   /   \  [   ]
    void --> метод ничего не возвращает / пустота
    main --> название метода
    String[] args --> параметры (аргументы) метода
    {...} --> тело метода
    */
    public static void main(String[] args) {
        //тело метода
        System.out.print("Hello World");
    }

}
