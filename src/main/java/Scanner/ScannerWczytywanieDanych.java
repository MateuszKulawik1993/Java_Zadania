package Scanner;

import java.util.Scanner;

public class ScannerWczytywanieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String linia = scanner.nextLine();
            System.out.println("Wprowadzilem:" + linia);
            if(linia.equals("Koniec")){
                System.out.println("Koncze dzialanie");
                break;
            }
        }


    }
}
