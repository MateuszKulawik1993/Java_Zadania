package Klasy;

public class NazwaKlasy {
    public static final String NAZWA_STRING = "nazwa string";
    private String polePrywatneString = "jakis prywatny tekst";
    int nazwaZmiennej = 55;

    public NazwaKlasy(){

    }

    public void nazwaMetodaVoid(){
        int nazwaZmiennej =44;
        System.out.println("Wypisalem z metody void");
        metodaZwracaInta(5);
        System.out.println(nazwaZmiennej);
        System.out.println(this.nazwaZmiennej);
    }

    public void drugaMetoda(){
        int nazwaZmiennej;
        System.out.println("Druga metoda");
        metodaPrzyjmujeParametr(5);
        metodaPrzyjmujeParametr("5");
        metodaPrzyjmujeParametrZwracaString(555);
    }

    private int metodaZwracaInta(int a){
        return a;
    }
    private int metodaPrzyjmujeParametr(int a ){
        return a;
    }
    private int metodaPrzyjmujeParametr(String a ){
        return 5;
    }
    private int metodaPrzyjmujeParametr(int a,String b){
        return 55;
    }
    private String metodaPrzyjmujeParametrZwracaString(int a){
        return "tekst";
    }
}
