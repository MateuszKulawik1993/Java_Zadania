package Dziedziczenie.zadanie4;

public class Pracownik extends Osoba {
  protected   String stanowisko;
   protected String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }
    @Override
    void przedstawSie(){
        System.out.println("Jestem"+ " " + this.imie + " " + this.nazwisko +" " + "i pracuje w firmie"+ " "+ this.nazwaFirmy + " " + "na stanowisku"+ " "+ this.stanowisko);
    }
}
