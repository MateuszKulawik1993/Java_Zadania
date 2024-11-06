package Klasy.zadanie3;


public class Matma {
    public static final double PI=3.14;

    public static double obwodKola(double r){
        double wynik=0;
        wynik = 2*PI*r;
            return wynik;
    }

    public static double poleKola(double r){
        return PI*r*r;
    }
    public static double obowdProstokata(double a, double b){
        return 2*(a+b);
    }
    public static double poleProstokata(double a, double b){
        return a*b;
    }
    public static int suma(int []tab ) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public static int srednia(int []tab) {
        return suma(tab) / tab.length;

    }

    public static int min(int []tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int max(int[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
}
