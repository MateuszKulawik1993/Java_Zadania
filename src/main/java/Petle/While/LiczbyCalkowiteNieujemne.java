package Petle.While;

public class LiczbyCalkowiteNieujemne {
    public static void main(String[] args) {

        System.out.println("Wyświetl wszystkie liczby całkowite nieujemne, mniejsze od podanej liczby");
        int i =10;
        int min=0;

        while(min<i){
            System.out.println(min);
            if(min < i-1){
                System.out.println(" ");
            }
            min++;
        }

    }
}
