package Petle;

import java.util.Scanner;

public class RokPrzestepny {
    public static void main(String[] args) {
        System.out.println("Sprawdz czy podany rok jest przestępny");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok:");
        int rok = scanner.nextInt();

        if(rok % 4==0 ){
            System.out.println("Rok jest przestepny");
        }else{
            System.out.println("Rok nie jest przestepny");
        }



    }
}
