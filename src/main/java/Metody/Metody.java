package Metody;

public class Metody {
    public static void main(String[] args) {
        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaKtoraNicNiezwraca();
        nazwaObiektu.metodaPrzyjmujeArgument(555,'K');
        nazwaObiektu.nazwenictwoDowolneAleKolejnaMetoda(true,100);

        int wynikDodawanie = nazwaObiektu.dodawanie(10,15);
        System.out.println("Wynik dodawania:"+ wynikDodawanie);
        double wynikCosPoPrzecinku = nazwaObiektu.dodajCosPoPrzecinku(5.55);
        System.out.println("Wynik po przecinku:"+ wynikCosPoPrzecinku);

    }
}
