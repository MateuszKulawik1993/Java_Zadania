package Wyjatki.Tworzenie_Super;

public class Main {
    public static void main(String[] args) throws JakisException {
        try {
            wyrzucKoniecznieJakisWyjatek();
        } catch (JakisException e) {
            e.printStackTrace();
            System.out.println("Obsługuje odpowiednio wyjatek podczas catche" + "a wiadomsoc wyjatku to:" + e);
        }
    }

    public static void wyrzucKoniecznieJakisWyjatek() throws JakisException {
        throw new JakisException("Specjalna wiadomosc dla Was!");
    }
}

