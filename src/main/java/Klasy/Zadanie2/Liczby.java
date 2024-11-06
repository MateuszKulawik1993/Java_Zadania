package Klasy.Zadanie2;

public class Liczby {
    int[] tab;

    public Liczby(int[] tab) {
        this.tab = tab;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public int srednia() {
        int srednia = suma() / tab.length;
        return srednia;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
}
