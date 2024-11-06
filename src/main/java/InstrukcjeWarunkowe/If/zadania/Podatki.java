package InstrukcjeWarunkowe.If.zadania;

public class Podatki {
    public static void main(String[] args) {
        double kwota = 60000.620;
        if(kwota<0){
            System.out.println("Nic nie musisz zapalcioc podatku");
        } else if(kwota<=85528){
          double podatek = kwota* 0.17;
            System.out.println("Podatek do zaplaty wyniosi:" + podatek);
        }else{
            double podatekPonizejProgu = kwota* 0.17;
            double podatekPowyzejProgu = (kwota - 85528)*0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek juz większy do zaplaty wyniosi:" + podatek);


        }

    }
}
