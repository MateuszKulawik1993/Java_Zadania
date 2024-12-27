package com.kulawik.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        //given
        Calculator calc = new Calculator();
        //when
      int sumResult = calc.add(5,4);
        //then
        assertEquals(9,sumResult);
    }
    @Test
    void divisionTest(){
        //given
        Calculator calc = new Calculator();
        //when
        int divisionResult= calc.divide(10,5);
        //then
        assertEquals(2, divisionResult);
    }
    @Test
    void isEven(){
        //given
        Calculator calc =new Calculator();
        //when
        boolean result2=calc.isEven(4);
        //then
        assertTrue(result2);
        assertFalse(calc.isEven(3));
    }
    @ParameterizedTest
    @ValueSource(ints ={2,4,6,8,10})
    void isEven1(){
        //given
        Calculator calc =new Calculator();
        //when & then
        assertTrue(calc.isEven(2));
        assertTrue(calc.isEven(4));
        assertTrue(calc.isEven(6));
        assertTrue(calc.isEven(8));
        assertTrue(calc.isEven(10));
    }
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",    // a = 1, b = 2, wynik = 3
            "5, 7, 12",   // a = 5, b = 7, wynik = 12
            "-1, -3, -4"  // a = -1, b = -3, wynik = -4
    })
    void shouldCheckIfAddMethodWorksGood(){
        //given
        Calculator calc = new Calculator();
        //when & then
        assertEquals(3,calc.add(1,2));
        assertEquals(12,calc.add(5,7));
        assertEquals(-4,calc.add(-1,-3));
    }


}