package Wyjatki.Tworzenie;

public class MainWyjatkiTworzenie {
    public static void main(String[] args) {
        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("jan.kowalski.przyklad.com");
            uzytkownik.wprowadzHaslo("qwery123");
            System.out.println("Wszystko poszlo ok:");
        } catch (NiezbytTajneHasloExepction e) {
            System.out.println("Hasło niezbyt bezpieczne");
        }catch (NiepoprawnyEmailException e) {
            System.out.println("Email nie zawiera @");
        }

        System.out.println("Czy doszedlem tutaj??");
    }

}
