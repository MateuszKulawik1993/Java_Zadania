package Klasy.Zadanie1;

public class MainProgramista{
    public static void main(String[] args) {
        Programista programista = new Programista("Mateusz","Kulawik","Java", 10000);

        String imie = programista.pobierzImie();
        System.out.println("Imie:"+ imie);

        String nazwisko = programista.pobierzNazwisko();
        System.out.println("Nazwiskso:"+ nazwisko);

        String jezyk = programista.pobierzJezyk();
        System.out.println("Jezyk programowania:"+ jezyk);

        int pensja = programista.pobierzZarobki();
        System.out.println("Pensja programisty:"+ pensja);
    }
}
