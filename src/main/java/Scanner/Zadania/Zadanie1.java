package Scanner.Zadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie.");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko.");
        String nazwisko = scanner.next();
        System.out.println("Podaj wzrost.");
        int wzrost = scanner.nextInt();

        System.out.println("Jestem" + imie +" "+  nazwisko+ " "+ " Mam" + " "+ wzrost+ "cm wzrostu");
    }
}
