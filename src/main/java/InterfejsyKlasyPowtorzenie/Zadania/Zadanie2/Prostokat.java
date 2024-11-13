package InterfejsyKlasyPowtorzenie.Zadania.Zadanie2;

public class Prostokat implements Figury{

    double a;
    double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return 2*a + 2*b;
    }

    @Override
    public double pole() {
        return a*b;
    }
}
