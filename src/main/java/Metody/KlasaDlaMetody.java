package Metody;

public class KlasaDlaMetody {

    void metodaKtoraNicNiezwraca(){
        System.out.println("Wartosc wypisana z metody");
    }

    void metodaPrzyjmujeArgument(int liczba,char pojedynczyZnak){
        liczba++;
        System.out.println("Wartosc z metody:"+ " "+ liczba+ pojedynczyZnak);
    }
    void nazwenictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba){
        if(czyPokazac){
            System.out.println("Liczba:"+ liczba);
        }else{
            System.out.println("Nie pozwola pokazac");
        }
    }

    int dodawanie(int a, int b){
        int wynik = a+ b;
        return wynik;
    }
    double dodajCosPoPrzecinku(double liczbaDouble){
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }
    boolean zamienWartoscLogiczna(boolean wartoscLogiczna){
        return !wartoscLogiczna;
    }
    int zwrocOdwartoscilogicznej(boolean czyZwrocic, int liczba){
        if(czyZwrocic){
            return liczba;
        }else{
            return 0;
        }
    }
    void voidKtoryMialbyCosZwracac(boolean czZakonczyc){
       if(czZakonczyc) {
           return;
       }
        System.out.println("Cos napsiane bo nie zakonczonewartoscia logiczna");
    }


}
