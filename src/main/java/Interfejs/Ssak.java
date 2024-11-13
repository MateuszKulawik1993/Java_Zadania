package Interfejs;

public class Ssak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("Przez pluca");
    }

    @Override
    public void odzywianie() {
        System.out.println("Miesko badz roslinki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("Plod");
    }
}
