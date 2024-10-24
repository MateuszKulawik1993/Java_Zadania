package Petle;

import java.util.Scanner;

public class PorownanieGrupowanie {
    public static void main(String[] args) {
        System.out.println("Porównaj ze sobą 3 nie równe sobie liczby i wypisz je w kolejności od największej do najmniejszej");
        System.out.println("Podaj pierwsza liczbe:");
        System.out.println("Poda druga liczbe:");
        System.out.println("Podaj trzecia liczbe:");

        Scanner scanner = new Scanner(System.in);
        int l_1 = scanner.nextInt();
        int l_2 = scanner.nextInt();
        int l_3 = scanner.nextInt();

        System.out.println("Porównujemy liczby: l1, l2, l3");
        int min = l_1; //zakladamy ze jest to najmniejsza
        if (l_2 < l_1 && l_2 < l_3) {min = l_2;}
        if (l_3 < l_1 && l_3 < l_2) {min = l_3;}
        int max = l_1; //zakladamy ze jest to największa
        if (l_2 > max) {max = l_2;}
        if (l_3 > max) {max = l_3;}
        int mid = 0;
        if(l_1 != min && l_1 != max) {mid = l_1;}
        if(l_2 != min && l_2 != max) {mid = l_2;}
        if(l_3 != min && l_3 != max) {mid = l_3;}
        System.out.println("większa z liczb to " + max + ", następnie " + mid + " i " + min);
        }
    }

