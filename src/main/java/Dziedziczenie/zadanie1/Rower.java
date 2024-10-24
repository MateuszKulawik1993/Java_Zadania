package Dziedziczenie.zadanie1;

public class Rower extends Pojazd {
    int iloscKol = 2;

    public Rower(String typ, String marka, int wiek, int iloscKol1) {
        super(typ, marka, wiek);
        this.iloscKol = iloscKol1;
    }

   public void jedz(){
        System.out.println("Jade nowym rowerem");
   }

}
