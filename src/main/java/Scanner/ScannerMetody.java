package Scanner;

import java.util.Scanner;

public class ScannerMetody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int wczytany = scanner.nextInt();
            System.out.println("Wczytany:" + wczytany);
        }
        System.out.println("Zakonczylem swoje dzialanie");
    }
}
