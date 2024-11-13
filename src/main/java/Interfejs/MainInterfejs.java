package Interfejs;

public class MainInterfejs {
    public static void main(String[] args) {
        Rybka ryba = new Rybka();
        Ptaki ptak = new Ptaki();
        Ssak ssak =new Ssak();

        System.out.println("Ryba");
        ryba.oddychanie();
        ryba.odzywianie();
        ryba.wydawaniePokolenia();
        System.out.println();

        System.out.println("Ptak");
        ptak.oddychanie();
        ptak.odzywianie();
        ptak.wydawaniePokolenia();
        System.out.println();

        System.out.println("Ssak");
        ssak.oddychanie();
        ssak.odzywianie();
        ssak.wydawaniePokolenia();
    }
}
