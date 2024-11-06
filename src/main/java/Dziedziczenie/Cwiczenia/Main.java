package Dziedziczenie.Cwiczenia;

public class Main {
    public static void main(String[] args) {
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaPodstawowa.metodaDruga();
        klasaRozszerzona.metodaRozszerzona();
        klasaRozszerzona.metodaPierwsza();
        klasaBardziejRozszerzona.metodaPierwsza();
        klasaBardziejRozszerzona.metodaRozszerzona();
    }
}
