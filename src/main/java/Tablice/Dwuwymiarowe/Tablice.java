package Tablice.Dwuwymiarowe;

public class Tablice {
    public static void main(String[] args) {
        int tablicaDwuWymiarowe[][]= new int[10][10];

        tablicaDwuWymiarowe[0][1]= 150;
        tablicaDwuWymiarowe[4][8]= 190;

        System.out.println(tablicaDwuWymiarowe[4][8]);

        int[][] nowatablica={
                {1,2,3,11,12,13},
                {4,5,6,41,42,43}
        };
        System.out.println("[0][0]:"+nowatablica[0][0] );
        System.out.println("[0][1]:"+nowatablica[0][1] );
        System.out.println("[1][2]:"+nowatablica[1][2] );
        System.out.println("[1][5]:"+nowatablica[1][5] );

        System.out.println("Rozmiar calej tablicy:"+tablicaDwuWymiarowe.length );
        System.out.println("Rozmiar kolumny 0:"+tablicaDwuWymiarowe[0].length);
        System.out.println("Rozmiar kolumny 1:"+tablicaDwuWymiarowe[1].length);
        System.out.println("Rozmiar kolumny 2:"+tablicaDwuWymiarowe[2].length);
        System.out.println("Rozmiar kolumny 3:"+tablicaDwuWymiarowe[3].length);
        System.out.println("Rozmiar kolumny 4:"+tablicaDwuWymiarowe[4].length);
        System.out.println("Rozmiar kolumny 9:"+tablicaDwuWymiarowe[9].length);






    }
}
