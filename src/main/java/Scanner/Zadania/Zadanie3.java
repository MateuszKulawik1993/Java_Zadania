package Scanner.Zadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj linię:");
        String linia = scanner.nextLine();
        System.out.println("Podaj liczbe linii:");
        int liczbaLini = scanner.nextInt();
        for(int i = 0;i<liczbaLini;i++){
            System.out.println(linia);
        }

    }
}
