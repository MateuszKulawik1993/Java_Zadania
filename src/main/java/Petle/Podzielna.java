package Petle;

import java.util.Scanner;

public class Podzielna {
    public static void main(String[] args) {

        System.out.println("Sprawdz czy liczba jest podzielna przez 3");
        System.out.println("Prosze podac liczbe:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a%3==0) {
            System.out.println("Liczba jest podzielna przez 3");
        }else{
            System.out.println("Liczba nie jset podzialna przez 3");
        }
    }
}
