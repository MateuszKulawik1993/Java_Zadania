package ModyfikatoryDostepu;

public class ModyfikatoryDostepu {
    public int polePubliczne; //dostepny wszedzie
    protected int poleDziedziczenie; //dostepny w dziedziczeniu oraz w tym samym package'u
    private int polePrywatne; //dostepny w obrebie tej klasy
    int poleBezniczego; // package- dostepny w tym samym package'u
}
