package Tablice.Dwuwymiarowe.Zadanie;

public class Tablica {
    public static void main(String[] args) {
        double[][] tabDwu= new double [3][5];
        tabDwu[0][0]= 3.5;
        tabDwu[0][1]= 2.4;
        tabDwu[0][2]= 5.7;
        tabDwu[0][3]= 8.2;
        tabDwu[0][4]= 3.4;

        tabDwu[1][0]= 8.4;
        tabDwu[1][1]= 4.5;
        tabDwu[1][2]= 3.3;
        tabDwu[1][3]= 9.8;
        tabDwu[1][4]= 10.4;

        tabDwu[2][0]= 9.4;
        tabDwu[2][1]= 4.3;
        tabDwu[2][2]= 5.3;
        tabDwu[2][3]= 5.8;
        tabDwu[2][4]= 2.4;

        double pierszwyWierszSuma=tabDwu[0][0]+tabDwu[0][1]+ tabDwu[0][2]+ tabDwu[0][3]+tabDwu[0][4];
        double drugiWierszSuma=tabDwu[1][0]+tabDwu[1][1]+ tabDwu[1][2]+ tabDwu[1][3]+tabDwu[1][4];
        double trzeciWierszSuma=tabDwu[2][1]+tabDwu[2][1]+ tabDwu[2][2]+ tabDwu[2][3]+tabDwu[2][4];

        System.out.println("Wynik pierszy wiersz:"+pierszwyWierszSuma );
        System.out.println("Wynik drugi wiersz:"+drugiWierszSuma );
        System.out.println("Wynik trzeci wiersz:"+trzeciWierszSuma );









    }
}
