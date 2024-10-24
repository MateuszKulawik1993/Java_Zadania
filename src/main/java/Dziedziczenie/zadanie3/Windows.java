package Dziedziczenie.zadanie3;

public class Windows extends OperatingSystem {
    public Windows(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("I ma turning on the Windows");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("I ma turning off the Windows");
    }
}
