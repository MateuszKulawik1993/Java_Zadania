package Interfejs;

public class KlasaTestowa implements PrzykladowyInterfejs, DrugiInterfejs{
    @Override
    public void metodaWInterfejsie() {

    }

    @Override
    public int metodaZparametrem(int z) {
        return 0;
    }

    @Override
    public String metodaZwracaStringa(String str) {
        return "";
    }
}
