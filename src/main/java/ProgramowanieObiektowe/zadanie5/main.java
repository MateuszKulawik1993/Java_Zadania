package ProgramowanieObiektowe.zadanie5;

public class main {
    public static void main(String[] args) {
    String[] user = new String[5];
        User michael= new User("Michael",30);
        User david = new User("Dawid",29);
        User anna= new User("Anna",32);
        User camilla= new User("Camilla", 32);
        User frank= new User("Frank", 27);

        String[] imie = {"Michael","Dawid","Anna","Camilla","Frank"};
        int[] wiek= {30,29,32,32,27};

        int iloscObiketow = user.length;
        System.out.println(iloscObiketow);

        int suma = 0;
        for(int i = 0; i<wiek.length; i++){
            suma= suma + wiek[i];
        }
        System.out.println("Wynik sumowania:"+ suma);

        int srednia = suma / iloscObiketow;
        System.out.println("Srednia wieku to:" +" "+ srednia);

    }
}
