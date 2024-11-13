package Interfejs;

public class Ptaki implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("Przez pluca");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("jajo");
    }
}
