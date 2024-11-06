package Pola;

public class MainPola {
    public static void main(String[] args) {

        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita= 15;
        System.out.println(obiekt.liczbaCalkowita);
        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(100);
        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(200);
        int zmienna = obiekt.ZwrocWartoscPolaZMetody();
        System.out.println("Zmienna:" + zmienna);
    }
}
