package Klasy.zadanie3;

public class MainMatma {
    public static void main(String[] args) {
        System.out.println("Obwod kola:"+ Matma.obwodKola(5));
        System.out.println("Pola kola:"+ Matma.obwodKola(4));
        System.out.println("Obwod prostokata:"+ Matma.obowdProstokata(10,7));
        System.out.println("Pola prostokata:"+ Matma.poleProstokata(7,6));

        int [] tab={5,7,10};
        System.out.println("Srednia z tabicy:"+ Matma.srednia(tab));

    }
}
