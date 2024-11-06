package Petle.zadania;

public class zadanie4 {
    public static void main(String[] args) {
        int[] tab = {10,15,13,25,52,31,22,25,15,61};
        for(int i =0; i<= 9;i++){
            System.out.println(tab[i]+" ");
        }


        for(int i= tab.length -1; i>=0;i--){
            System.out.println(tab[i]+" ");
        }


        int suma=0;
        for(int i = 0;i<tab.length;i++){
            suma+=tab[i];
        }
        System.out.println("Suma:" + suma);
    }


}
