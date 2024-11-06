package Wyjatki.Przenoszenie;

import java.io.FileNotFoundException;

public class MainWyjatkiPrzenoszenie {
    public static void main(String[] args) {
        WyjatekPrzenoszenie wyjatekPrzenoszenie = new WyjatekPrzenoszenie();
        try {
            wyjatekPrzenoszenie.wyjatkowaMetoda();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
