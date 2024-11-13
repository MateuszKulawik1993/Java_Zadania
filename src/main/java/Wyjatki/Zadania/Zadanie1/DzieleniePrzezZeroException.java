package Wyjatki.Zadania.Zadanie1;

public class DzieleniePrzezZeroException extends Exception{

    public DzieleniePrzezZeroException(){
        super("Nie wolno dzielic przez 0!");
    }
}
