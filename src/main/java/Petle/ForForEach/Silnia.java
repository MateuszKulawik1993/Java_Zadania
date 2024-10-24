package Petle.ForForEach;

public class Silnia {
    public static void main(String[] args) {
        System.out.println("Napisz skrypt, obliczający n! (n silnia)");

        int n=2;
        if(n<2){
            System.out.println("Podaj liczbę dodatnia");
        } else if (n==0 || n==1) {
            System.out.println(1);
        }else{
            int silnia = 1;
            for(int i =2; i<2; i++) {
                silnia *= i;
            }
            System.out.println(silnia);
        }


    }
}
