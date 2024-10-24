package Dziedziczenie.zadanie1;

public class Samochod extends Pojazd {
    int iloscKol = 4;

    public Samochod(String typ, String marka, int wiek, int iloscKol1) {
        super(typ, marka, wiek);
        this.iloscKol = iloscKol1;
    }

    public void jedz() {
        System.out.println("Jezdze samochodem:");
    }
    public void tankuj() {
        System.out.println("Tankuje benzyne");
    }
}