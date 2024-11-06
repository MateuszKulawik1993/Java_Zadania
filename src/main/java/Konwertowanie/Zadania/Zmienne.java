package Konwertowanie.Zadania;

import static java.lang.Math.pow;

public class Zmienne {
    public static void main(String[] args) {


    int wiek = 31;
    float wzrost = 1.82f;
     float waga =72.9f;

    System.out.println("Wiek:"+ wiek+" " + "lat");
    System.out.println("Wzrost:"+ wzrost +" " + "cm");
    System.out.println("Waga:"+ waga +" " + "kg");

    float bmi = waga /(float)Math.pow(wzrost,2);
    System.out.println("Moje BMI:"+ bmi);

    int bmi1 =(int) waga /(int)Math.pow(wzrost,2);
    System.out.println("Moje BMI:"+ bmi1);

    }
}
