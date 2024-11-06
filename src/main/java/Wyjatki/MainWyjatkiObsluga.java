package Wyjatki;

public class MainWyjatkiObsluga {

    static String str;
    static int[] tablica;
    public static void main(String[] args) {
        //ang. excpetion

//        try{
//          System.out.println("Przed wykonaniem");
//            System.out.println("Czy pusty:"+ str.isEmpty());
//           System.out.println("Po wyknaniu");
//        }catch(NullPointerException exception){
//            System.out.println("Nie utworzyles stringa");
//        }
//        System.out.println("Na koniec programu wypisz to cos");
        tablica = new int[3];
        try{
            tablica[0]= 101;
            tablica[1]= 202;
            tablica[2]= 303;
            System.out.println("Wszytko poszlo ok");
        }catch(NullPointerException |ArrayIndexOutOfBoundsException e) {
            System.out.println("Bład z tablica");
        }
        System.out.println("Na koniec programu wypisz to cos");

    }
}
