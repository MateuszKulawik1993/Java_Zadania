package KlasaAnonimowa;

public class MainKlasaAnonimowa {
    public static void main(String[] args) {

        ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa() {
            @Override
            public void metodaZwykla() {
                System.out.println("Metoda wywolana z klasy anonimowej");
            }
        };
        obiektKlasyAnonimowej.metodaZwykla();

    }
}
