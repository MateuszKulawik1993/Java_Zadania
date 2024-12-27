package Enum.TypWyliczeniowy.Konstruktor;

public enum Pizza {
    MALA(20),
    SREDNIA(32),
    DUZA(40),
    XXL(50);

    private final int rozmiar;

        private Pizza(int rozmiar){
        this.rozmiar=rozmiar;
    }
    public int pobierzRozmiar(){
        return this.rozmiar;
    }
}
