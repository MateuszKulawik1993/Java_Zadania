package Petle;

import java.util.Scanner;

public class WikekszaMniejsza {
    public static void main(String[] args) {
        System.out.println("Sprawdz, która liczba jest większa ");
        System.out.println("Podaj pierwsza liczbę: ");
        System.out.println("Podaj drugą liczbę: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("Pierwsza liczba jest większa");
        }else{
            System.out.println("Druga liczba jest większa ");
        }


    }
}
