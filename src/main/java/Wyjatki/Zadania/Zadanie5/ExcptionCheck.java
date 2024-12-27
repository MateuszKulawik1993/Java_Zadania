package Wyjatki.Zadania.Zadanie5;

import java.util.Scanner;

public class ExcptionCheck {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner =new Scanner(System.in);
        int age = scanner.nextInt();

        if(age<0){
            throw new InvalidAgeException("Your age is not valid");
        }
        if(age>18){
            System.out.println("Jestes pełnoletni");
        }else{
            System.out.println("Jestes niepelnoletni");
        }

    }
}
