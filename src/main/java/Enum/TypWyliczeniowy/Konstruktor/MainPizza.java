package Enum.TypWyliczeniowy.Konstruktor;

public class MainPizza {
    public static void main(String[] args) {
        Pizza pizza = Pizza.DUZA;
        System.out.println("Zamawiam pizze:" + pizza + pizza.pobierzRozmiar());
    }
}
