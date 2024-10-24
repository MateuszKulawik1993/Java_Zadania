package Dziedziczenie.zadanie3;

public class Linux extends OperatingSystem{
    public Linux(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("I ma turning on the Linux");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("I ma turning off the Linux");
    }
}
