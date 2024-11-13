package InterfejsyKlasyPowtorzenie;

public class Klasa extends KlasaAbstrkcyjna implements Interfejs, DrugiInterfejs{
    private int pole;

    public void metodaKlas(){
        System.out.println("Wykonuje czynnosci w klasie");
    }

    @Override
    public void metodaAbstarkcyjna() {
        System.out.println("Wlasna obsluga metody abstarkcyjnej w klasie");
    }

    @Override
    public void metodaInterfejsu() {
        System.out.println("Zaimplementowalem metode intefrfejsu  w klasie");
    }

    @Override
    public void metodaDrugiegoInterfejsu() {
        System.out.println("Zaimplementowalem metode drugiego intefrfejsu  w klasie");
    }
}
