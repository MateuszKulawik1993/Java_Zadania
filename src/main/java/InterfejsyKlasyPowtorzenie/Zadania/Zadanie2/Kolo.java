package InterfejsyKlasyPowtorzenie.Zadania.Zadanie2;

public class Kolo implements Figury{

   double r;
   public static final double PI =3.14;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obwod() {
        return 2*PI*r;
    }

    @Override
    public double pole() {
        return PI*r*r;
    }
}
