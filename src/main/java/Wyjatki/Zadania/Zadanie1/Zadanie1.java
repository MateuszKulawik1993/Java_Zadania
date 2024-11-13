package Wyjatki.Zadania.Zadanie1;

public class Zadanie1 {
    public static void main(String[] args) {

        try {
            int a = 6;
            int b = 0;

            System.out.println("Wynik dzielenia:" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielic przez zero!");
        }


        try {
            System.out.println("Wynik dzielnia z metody:" + podziel(6, 0));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int podziel( int a, int b) throws DzieleniePrzezZeroException {
        if(b==0){
            throw new DzieleniePrzezZeroException();
        }
    return a / b;
    }
}

