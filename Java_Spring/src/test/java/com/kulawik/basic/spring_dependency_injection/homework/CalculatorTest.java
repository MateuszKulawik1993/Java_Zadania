package com.kulawik.basic.spring_dependency_injection.homework;

import com.kulawik.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator  calculator;

    @Test
    void addTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kulawik.basic.spring_dependency_injection");
        Display bean = context.getBean(Display.class);
        double addResult= calculator.add(4.0,5.0);
        assertEquals(9.0,addResult);
    }

    @Test
    void subtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kulawik.basic.spring_dependency_injection");
        Display bean = context.getBean(Display.class);
        double subResult= calculator.subtract(9.0,5.0);
        assertEquals(4.0,subResult);
    }

    @Test
    void multiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kulawik.basic.spring_dependency_injection");
        Display bean = context.getBean(Display.class);
        double multResult= calculator.multiply(3.0,5.0);
        assertEquals(15.0,multResult);
    }

    @Test
    void divideTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kulawik.basic.spring_dependency_injection");
        Display bean = context.getBean(Display.class);
        double divResult= calculator.divide(9.0, 3.0);
        assertEquals(3.0,divResult);

    }
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0.0));
        assertEquals("Dzielenie przez zero jest niedozwolone.", exception.getMessage());
    }
}