package lesson32;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UtilMathStringTest {
    private UtilMathString testWork;
    private List<Integer> integerList;
    @BeforeEach
    public void setUp(){
        testWork = new UtilMathString();
        integerList = new ArrayList<>();
    }
    @Test
    void testAdd(){
        Assert.assertEquals(0, integerList.size());
        Assert.assertTrue(integerList.add(10));
        Assert.assertTrue(integerList.add(30));
        Assert.assertEquals(2, integerList.size());
        int getResult = integerList.get(1);
        Assert.assertEquals(30, getResult);
    }


    @Test
    @DisplayName("1. Проверка позитивных чисел")
    void checkPositiveNumberPositive(){
     assertEquals(6, UtilMathString.max(5, 6));
 }
 @Test
    void checkNegativeNumberNegative(){
        assertEquals(-1, UtilMathString.max(-10, -1));
 }

    void checkMixNumberPositive() {
        assertEquals(11, UtilMathString.max(-10, 11));
    }

    @Test

    void checkZeroPositiveNumberPositive() {
        assertEquals(20, UtilMathString.max(0, 20));
    }

    @Test

    void checkZeroNegativeNumberPositive() {
        assertEquals(0, UtilMathString.max(-99, 0));
    }

    @Test

    void checkEqualsNumberPositive() {
        assertEquals(0, UtilMathString.max(0, 0));
    }

@ParameterizedTest
    @MethodSource("lesson32.UtilMathString#stringProvider")
    void testStringProvider(String arguments){
        assertTrue(arguments.length() > 0);
        // /\ or asserFalse(argument.isEmpty());
}
@ParameterizedTest
    @CsvSource({
            "1,1,1", //{
            "2,3,3",  // 1 и 2 числа отправляются в метод как параметры, 3 число возвращается
            "3,5,5"   // }
    })
    void testMaxValue(int a, int b, int expected){
        assertEquals(expected, testWork.max(a,b));
}



}