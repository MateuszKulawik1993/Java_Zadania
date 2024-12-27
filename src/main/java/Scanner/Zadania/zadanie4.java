package Scanner.Zadania;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma= 0;
        int liczbaNieujemna;
        while((liczbaNieujemna = scanner.nextInt())>=0){
            suma+=liczbaNieujemna;
        }
        System.out.println("Wynik:"+ suma);
    }
}
