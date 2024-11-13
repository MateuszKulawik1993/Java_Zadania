package Dziedziczenie.Cwiczenia.Rzutowanie;

public class MainRzutowanie {
    public static void main(String[] args) {
        KlasaRoszerzona klasaRoszerzona = new KlasaRoszerzona();
        klasaRoszerzona.ustawLiczbe(1000);
        klasaRoszerzona.wyswietlLLiczbe();

        KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRoszerzona;
        klasaPodstawowa.wyswietlLLiczbe();


    }
}
