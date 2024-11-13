package KlasaString.Zadania;

public class Zadanie2 {
    public static void main(String[] args) {
        String zdanie = "Potrafie coreaz wiecej z programowania";

        for(int i = 0; i<zdanie.length();i++){
            System.out.println(zdanie.charAt(i));
        }

        for(int i = zdanie.length()-1;i>=0;i--){
            System.out.println(zdanie.charAt(i));
        }

    }
}
