package Petle.While;

public class NWD {
    public static void main(String[] args) {
        System.out.println("NWD:");
        int x = 15;
        int y = 10;
        int a=x;
        int b=y;
        while(a!=b) {
            if(a>b) a-=b;
            else b-=a;
        }
        int nwd = a; // lub b - obie zmienne przechowują wynik NWD(a,b)
        System.out.println("Dla a = " + x + " i b = " + y + " NWD = " + nwd);
    }
}
