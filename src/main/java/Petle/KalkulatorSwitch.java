package Petle;

import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        System.out.println("Kalkulator liczb");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        int a = scanner.nextInt();

        System.out.println("Podaj druga liczbe:");
        int b = scanner.nextInt();

        System.out.println("Podaj znak:");
        String dzialanie = scanner.nextLine();

        switch (dzialanie){
            case"+":
                System.out.println(a + b);
                break;
            case"-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case"/":
                System.out.println(a / b);
                break;


        }



    }
}
