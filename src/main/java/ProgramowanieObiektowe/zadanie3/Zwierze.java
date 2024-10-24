package ProgramowanieObiektowe.zadanie3;

public class Zwierze {
   private String imie;
    private int wiek;

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void dajGlos(){
        System.out.println("Hau hau");
    }

    public int ileMalat(){
        return wiek;
    }





}
