package KlasaString;

public class StringRownyEquals {
    public static void main(String[] args) {
        String strLitera1 = "tekst";
        String strLitera2 = "tekst";

      boolean wynik= strLitera1 == strLitera2;
      System.out.println("strLitera1 == strLitera2:"+ wynik);

      String strObject1 = new String("tekst");
      String strObject2 = new String("tekst");
      wynik = strObject1 ==strObject2;
      System.out.println("strObject1 ==strObject2:"+ wynik);

      wynik = strLitera1 == strObject1;
      System.out.println("strLitera1 == strObject1:"+ wynik);

      //equals()

      wynik = strLitera1.equals(strLitera2);
      System.out.println("strLitera1.equals(strLitera2:"+ wynik);

      wynik = strObject1.equals(strObject2);
      System.out.println("strObject1.equals(strObject2:"+ wynik);

      wynik = strLitera1.equals(strObject1);
      System.out.println("strLitera1.equals(strObject1):"+ wynik);

      String strInnyTekst = "tekst";
      wynik = strLitera1.equals(strInnyTekst);
      System.out.println("strLitera1.equals(strInnyTekst):"+ wynik);


    }
}
