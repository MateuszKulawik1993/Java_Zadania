package Wyjatki.Zadania.Zadanie2;

public class ArrayesException {
    public static void main(String[] args) {

        try {
            int[] tab = new int[2];
            tab[0] = 1;
            tab[1] = 3;
            for (int i = 0; i <= tab.length; i++) {
                System.out.println(tab[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyjatek został rzucony");

        }finally {
            System.out.println("Koniec programu");
        }
    }

}
