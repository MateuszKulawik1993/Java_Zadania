package com.kulawik.calculator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by Zero");
        }else{
            return a/b;
        }
    }
    public boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
}
