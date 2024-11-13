package Wyjatki.Zadania.Zadanie3;

public class LiczbaUjemnaException extends RuntimeException{

    public LiczbaUjemnaException(){
        super("Liczba nie może byc ujemna");
    }

}
