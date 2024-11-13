package com.kulawik.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void CheckWhenSummingIsEqual30() {
        //given
        Calculator calculator = new Calculator();
        //when
        int sum = calculator.sum(15,15);
        //then
        assertEquals(30,sum);
    }

    @Test
    void CheckWhenSubstarctIsEqual85() {
        //given
        Calculator calculator = new Calculator();
        //when
        int substract = calculator.substract(100,15);
        //then
        assertEquals(85,substract);
    }

    @Test
    void CheckWhenMultiplyResultIsEqual100() {
        //given
        Calculator calculator = new Calculator();
        //when
        int multiply = calculator.multiply(10,10);
        //then
        assertEquals(100,multiply);
    }

    @Test
    void CheckWhenDivisionReslutIsEqual1() {
        //given
        Calculator calculator = new Calculator();
        //when
        int divine = calculator.divide(10,10);
        //then
        assertEquals(1,divine);
    }
}