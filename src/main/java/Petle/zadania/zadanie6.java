package Petle.zadania;

public class zadanie6 {
    public static void main(String[] args) {
        //5! = 5*4*3*2*1 = 120

        int liczba= 5 ;
        int wynikSilnia =1;

        for(int i = liczba; i>=1; i--){
            wynikSilnia = wynikSilnia*i;
        }
        System.out.println("Wynik silnia:"+ wynikSilnia);
    }
}
