package KlasaString.Zadania;

public class Zadanie1 {
    public static void main(String[] args) {
        String imie = "Mateusz";
        String nazwisko = "Kulawik";
        String imieNazwisko = imie + " " + nazwisko;

        System.out.println(imieNazwisko);

        System.out.println("a_");
        imie.length();
        System.out.println("Imie:"+imie.length());
        nazwisko.length();
        System.out.println("Nazwisko"+nazwisko.length());
        imieNazwisko.length();
        System.out.println("Imie i Nazwisko" + imieNazwisko.length());

        System.out.println("b)");
        if(imie.equals("Alicja")){
            System.out.println("Masz na imie Alicja");
        }else if(imie.equals("Jan")){
            System.out.println("Masz na imie Jan");
        }else{
            System.out.println("Nie masz na imie Alicja ani Jan");
        }

        System.out.println("c)");
        System.out.println(nazwisko.toUpperCase());
        System.out.println(nazwisko.replace('a','e'));






    }

}
