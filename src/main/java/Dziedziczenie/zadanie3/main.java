package Dziedziczenie.zadanie3;

public class main {
    public static void main(String[] args) {

        Windows windows = new Windows(1995);
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux(1999);
        linux.turnOn();
        linux.turnOff();

    }
}
