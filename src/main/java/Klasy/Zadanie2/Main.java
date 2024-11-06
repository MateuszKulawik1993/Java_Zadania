package Klasy.Zadanie2;

public class Main {
    public static void main(String[] args) {

     int[] tab = {5,3,4,8,7};
     Liczby tablica = new Liczby(tab);

     int suma = tablica.suma();
     System.out.println("Suma:"+ suma);

     int srednia = tablica.srednia();
     System.out.println("Srednia:"+ srednia);

     int min = tablica.min();
     System.out.println("Wartosc min:"+ min);

     int max = tablica.srednia();
     System.out.println("Wartosc max:"+ max);

    }
}
