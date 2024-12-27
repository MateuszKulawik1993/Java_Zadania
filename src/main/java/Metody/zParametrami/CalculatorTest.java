package Metody.zParametrami;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbę");
        int firstNumber=scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int secondNumber=scanner.nextInt();

        Calculator calculator= new Calculator();
        int addition = calculator.add(firstNumber, secondNumber);
        int substraction= calculator.sub(firstNumber,secondNumber);
        int multiply= calculator.mul(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int modulo= calculator.mod(firstNumber, secondNumber);

        System.out.println("Dodawanie:"+ addition);
        System.out.println("Odejmowanie:"+ substraction);
        System.out.println("Mnożenie:"+ multiply);
        System.out.println("Dzielenie:"+ division);
        System.out.println("Modulo:"+ modulo);

    }
}
