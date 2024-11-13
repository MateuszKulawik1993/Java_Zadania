package Dziedziczenie.zadanie4;

public class Osoba {
   protected String imie;
 protected    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}