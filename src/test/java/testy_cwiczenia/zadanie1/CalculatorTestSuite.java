package testy_cwiczenia.zadanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 14;
        int b = 7;
        int sumResult = calculator.sum(a, b);
        assertEquals(21,sumResult);
    }
    @Test
    public void testSubstarct(){
        Calculator calculator = new Calculator();
        int a = 14;
        int b = 7;
        int substractResult = calculator.substract(a,b);
        assertEquals(7,substractResult);
    }
    @Test
    public void testMultiply(){
        Calculator calculator =new Calculator();
        int a = 14;
        int b = 7;
        int multiplyResult = calculator.multiply(a,b);
        assertEquals(98,multiplyResult);
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        int a = 14;
        int b = 7;
        int divideReslut = calculator.divide(a,b);
        assertEquals(2,divideReslut);
    }
}
