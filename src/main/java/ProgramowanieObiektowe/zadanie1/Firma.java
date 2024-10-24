package ProgramowanieObiektowe.zadanie1;

public class Firma {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[3];

        String[] imiona ={"Mateusz", "Klaudia","Jan"};
        String[] nazwiska = {"Kulawik","Kulawik","Augustyniak"};
        int[] wiek = {31,28,35};

        for(int i = 0; i< pracownicy.length; i++){
        pracownicy[i] = new Pracownik();
        pracownicy[i].imie= imiona[i];
        pracownicy[i].nazwisko= nazwiska[i];
        pracownicy[i].wiek= wiek[i];
        }

      System.out.println("Pracowanicy firmy to:");
       for(int i =0; i< pracownicy.length; i++) {
           System.out.println("Imiona:"+" "+pracownicy[i].imie+" " +"Nazwiska:"+" "+ pracownicy[i].nazwisko + " " +"Wiek:"+" "+ pracownicy[i].wiek );
       }



    }
}
