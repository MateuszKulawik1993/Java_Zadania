package Wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainWyjatkiCheckUnchecked {
    public static void main(String[] args) {
        File file = new File("lokalizacja_pliku/plik.txt");
        //checked z wymuszenia obsulgiwania, dziedzicza po klasie exepction
        try {
            InputStream inputStream =new FileInputStream(file);
        } catch (FileNotFoundException e) {
    //    e.printStackTrace();
            System.out.println("Ciagle jest ten wyjatek");
        }
        //unchecked exeption mozemy ale nie musimy ich obsugiwac, dziedziczy po RuntimeExeption
      //  NullPointerException, ArrayIndexOutOfBoundsException

    }
}
