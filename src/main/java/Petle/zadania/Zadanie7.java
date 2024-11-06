package Petle.zadania;

public class Zadanie7 {
    public static void main(String[] args) {

        int n = 5;
        int liczbaGwiazdek = 1;

        for(int i = 1; i<=n;i++) {
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.println("*");
            }

            System.out.println();
            liczbaGwiazdek++;
        }
    }
}
