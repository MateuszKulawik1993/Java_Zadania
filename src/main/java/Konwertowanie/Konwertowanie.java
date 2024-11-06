package Konwertowanie;

public class Konwertowanie {
    public static void main(String[] args) {

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;
        int wynik = intObliczenia / (int) doubleObliczenia;
        System.out.println("Wynik1:" + wynik);

        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble =doubleDrugi / doublePierwszy;
        System.out.println("Wynik2:" + wynikDouble);

        int  intWynik =(int) doubleDrugi / (int)doublePierwszy;
        System.out.println("Wynik3:" + intWynik);

        int  intWynik2 =(int) (doubleDrugi / doublePierwszy);
        System.out.println("Wynik4:" + intWynik2);

        char c = 'A';
        int czyMogeZaczarowacInta = c;
        System.out.println("Char na int:" + czyMogeZaczarowacInta);


    }
}
