package com.kulawik.calculator;

public class Calculator {
        int a;
        int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {

    }

    public int sum(int a, int b){
            return a+b;
        }
        public int substract(int a, int b){
            return a - b;
        }
        public int multiply(int a, int b){
            return a*b;
        }
        public int divide(int a, int b){
            return a/b;
        }

    }


