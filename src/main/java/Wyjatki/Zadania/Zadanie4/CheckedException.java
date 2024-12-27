package Wyjatki.Zadania.Zadanie4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("src.sdsd.txt");
    }

    public static void readFile(String path) throws FileNotFoundException {
            FileInputStream fileInputStream = new FileInputStream(path);
    }


}
