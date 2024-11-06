package Petle.Tablice;

public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int[100];

        for (int i = 0; i < tab.length; i++){
           tab[i]=i;
        }
        for (int i = 0; i<tab.length; i++){
            System.out.println("Tab:" + i +" "+ " : " + tab[i]);
        }
    }
}
