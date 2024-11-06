package Pola;

public class KlasaZPolami {
    int liczbaCalkowita;
    void zwrocWartoscPola(){
        System.out.println("Zwrocona wartosc pola:" +liczbaCalkowita );
    }
    void ustawWartoscPola(int wartosc){
         liczbaCalkowita = wartosc;
    }
    int ZwrocWartoscPolaZMetody(){
        return liczbaCalkowita;
    }
}
