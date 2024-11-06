package Pola.Static.Final;

public class MainPolaStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 15;
        //static pole i metoda
        KlasaStaticFinal.poleStatyczne = 15;
        System.out.println("KlasaStaticFinal.poleStatyczne:" + KlasaStaticFinal.poleStatyczne);
        KlasaStaticFinal.metodaStatyczna();

        //final
        System.out.println("Pole final:" + obiekt.poleFinal);

        //static final

        System.out.println(" KlasaStaticFinal.jakisTekst:"+  KlasaStaticFinal.JAKIS_TEKST);
    }
}
