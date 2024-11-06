package Wyjatki.Tworzenie;

public class Uzytkownik {
    public void wprowadzHaslo(String haslo) throws NiezbytTajneHasloExepction{
        if (!haslo.contains("tajne")){
            throw new NiezbytTajneHasloExepction();
        }
    }
    public void wprowadzEmail(String email){
        if(!email.contains("@")){
            throw new NiepoprawnyEmailException();
        }
        //zrob odpwoiednie rzeczy z emailem
    }
}
