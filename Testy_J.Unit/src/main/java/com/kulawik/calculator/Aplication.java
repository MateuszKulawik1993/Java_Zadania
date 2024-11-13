package com.kulawik.calculator;

public class Aplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(200,132);
        System.out.println("Sum:"+ sum);
        int subtract = calculator.substract(200,137);
        System.out.println("Subtract:"+ subtract);

        int multiply = calculator.multiply(200,132);
        System.out.println("multiply:"+ multiply);
        int divide = calculator.divide(200,137);
        System.out.println("Divide:"+ divide);

    }
}
