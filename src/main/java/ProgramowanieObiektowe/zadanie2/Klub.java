package ProgramowanieObiektowe.zadanie2;

public class Klub {
    public static void main(String[] args) {
        Zawodnik[] zawodnicy = new Zawodnik[4];
        String[]imiona = {"Robert","Lamine","Matijas","Wojciech"};
        String[]nazwiska = {"Lewandowski","Yamal","De Light","Szczesny"};
        String[]pozycje = {"napastnik","skrzydlowy","obronca","bramkarz"};
        int[]wiek = {36, 17, 28,34};

        for(int i =0;i< zawodnicy.length; i++){
            zawodnicy[i]=new Zawodnik();
            zawodnicy[i].imie= imiona[i];
            zawodnicy[i].nazwisko= nazwiska[i];
            zawodnicy[i].pozycja= pozycje[i];
            zawodnicy[i].wiek= wiek[i];
        }
        System.out.println("Zawodnicy klubu to:");
        for(int i=0; i< zawodnicy.length; i++){
            System.out.println( zawodnicy[i].imie +" "+ zawodnicy[i].nazwisko +" " + zawodnicy[i].pozycja +" "+zawodnicy[i].wiek );
        }



    }

}
