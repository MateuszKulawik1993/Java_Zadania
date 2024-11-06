package Klasy.Zadanie1;

public class Programista {
    private String imie;
    private String nazwisko;
    private String jezyk;
    int zarobki;

    public Programista(String imie, String nazwisko, String jezyk, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.jezyk = jezyk;
        this.zarobki = zarobki;
    }

    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk() {
        return jezyk;
    }
    public int pobierzZarobki(){
        return zarobki;
    }
}