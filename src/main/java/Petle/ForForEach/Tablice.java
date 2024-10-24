package Petle.ForForEach;

public class Tablice {
    public static void main(String[] args) {


        String[] teams = new String[4];

        teams[0] = "Fc Barcelona";
        teams[1] = "Real Madryt";
        teams[2] = "Manchester United";
        teams[3] = "Juventus Turyn";

        int iloscElementow = teams.length;
        System.out.println("Iloc elementow tablicy:" + iloscElementow);

        for(int i =0; i< teams.length; i++){
            System.out.println(teams[i]);
        }
        System.out.println("_________");
        for(int i= teams.length-1; i>=0; i--){
            System.out.println(teams[i]);
        }


    }
}
