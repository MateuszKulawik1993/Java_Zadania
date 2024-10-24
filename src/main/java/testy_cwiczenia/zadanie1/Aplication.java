package testy_cwiczenia.zadanie1;

import static testy_cwiczenia.zadanie1.ResultChecker.assertEquals;

public class Aplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 14;
        int b = 7;
        int sumResult = calculator.sum(a, b);
        boolean correct = assertEquals(21,sumResult);

        if(correct){
            System.out.println("Metoda sum dziala poprawnie dla liczb a i b");
        }else{
            System.out.println("Metoda sum nie dziala poprawnie dla liczb a i b");
        }
        int substractResult = calculator.substract(a,b);
        boolean correct1 = assertEquals(7,substractResult);

        if(correct1){
            System.out.println("Metoda substract dziala poprawnie dla liczb a i b");
        }else{
            System.out.println("Metoda substract nie dziala poprawnie dla liczb a i b");
        }

        int multiplyResult = calculator.multiply(a,b);
        boolean correct2 = assertEquals(98,multiplyResult);

        if(correct2){
            System.out.println("Metoda multiply dziala poprawnie dla liczb a i b");
        }else{
            System.out.println("Metoda multiply nie dziala poprawnie dla liczb a i b");
        }
        int divideResult = calculator.divide(a,b);
        boolean correct3 = assertEquals(2,divideResult);

        if(correct3){
            System.out.println("Metoda divide dziala poprawnie dla liczb a i b");
        }else{
            System.out.println("Metoda divide nie dziala poprawnie dla liczb a i b");
        }


    }

}
