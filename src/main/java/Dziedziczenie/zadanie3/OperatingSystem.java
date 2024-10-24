package Dziedziczenie.zadanie3;

public abstract class OperatingSystem {
    int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("I am turning on the system");
    }

    public void turnOff() {
        System.out.println("I am turning of the system");
    }

}