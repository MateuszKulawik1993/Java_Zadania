package Dziedziczenie.zadanie1;

public class Aplication {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("osobowy","Bmw",3,4);
        Rower rower = new Rower("Sportowy","Bmx",2,2);

        System.out.println("Kupiłem samochód" +" " + samochod.typ  + " " + "marki"+ " "+ samochod.marka);

        rower.jedz();



    }
}
