package KlasaAbstarkcyjna;

public class KlasaZwykla extends PrzykladowaKlasaAbstarkcyjna{
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisalem z klasy zwyklej");
    }

    @Override
    public int metodaZparamterem(String z) {
        System.out.println("Wypisuje parametr:" + z);
        return 100;
    }
}
