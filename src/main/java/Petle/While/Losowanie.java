package Petle.While;

import java.util.Random;

public class Losowanie {
    public static void main(String[] args) {
        Random random = new Random();

        int i=0;
        while(i<50){
            System.out.println(random.nextInt(40));
            i++;
        }

    }
}
