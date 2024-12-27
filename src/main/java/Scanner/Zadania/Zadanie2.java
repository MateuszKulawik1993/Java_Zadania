package Scanner.Zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");
        while(true){
            String text = scanner.next();
            if(text.equals("x")||text.equals("X")){
                break;
            }
            System.out.println(text);
        }

    }
}
