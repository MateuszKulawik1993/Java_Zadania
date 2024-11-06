package Tablice.Jednowymiarowe;

public class Tablice {
    public static void main(String[] args) {
        //ang. arrays
        int[]tablica =new int[10];
        tablica[0]= 5;
        tablica[1]= 10;
        tablica[2]= 15;
        tablica [3]= 20;

       System.out.println(tablica[5]);

       double[]tablicaDouble = new double[5];
       tablicaDouble[0]=2.0;
       tablicaDouble[1]=12.5;
       tablicaDouble[2]=3.75;
       tablicaDouble[3]=4.0;
       tablicaDouble[4]=15.50;

        System.out.println(tablicaDouble[2]);

        int[]nowaTabInt ={5,20,25,40};
        System.out.println("nowaTabInt[0]:" + nowaTabInt[0]);
        System.out.println("nowaTabInt[1]:" + nowaTabInt[1]);
        System.out.println("nowaTabInt[2]:" + nowaTabInt[2]);
        System.out.println("nowaTabInt[3]:" + nowaTabInt[3]);

        System.out.println("Tablica rozwiar:" + tablica.length);
        System.out.println("Tablica Double rozmiar:" + tablicaDouble.length);
        System.out.println("Tablica nowaTabInt rozmiar:" + nowaTabInt.length);



    }
}
