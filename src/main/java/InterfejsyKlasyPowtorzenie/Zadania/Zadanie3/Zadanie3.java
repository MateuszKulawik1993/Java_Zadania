package InterfejsyKlasyPowtorzenie.Zadania.Zadanie3;

public class Zadanie3 {
    public static void main(String[] args) {

    Info infAnnimowe = new Info() {
        @Override
        public void wyswietlInfo() {
           System.out.println("Informacja wypisana z klasy anonimowej");
        }
    };

    }


    interface Info{
        void wyswietlInfo();
    }


}
