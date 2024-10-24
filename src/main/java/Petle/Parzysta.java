package Petle;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Parzysta {
    public static void main(String[] args) {
        System.out.println("Liczba jest parzysta");
        System.out.println("Podaj liczbe:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a==0){
            System.out.println("Liczba jest parzysta");
        }else{
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
