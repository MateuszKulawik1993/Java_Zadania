package Interfejs;

public class Rybka implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("Przez skrzela");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("ikra");
    }
}
