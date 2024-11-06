package KlasaString;

public class StringMetody {
    public static void main(String[] args) {
        String tekst= "Jakis tekst";
        System.out.println("Length:"+ tekst.length());

        System.out.println("isEmpty:"+ tekst.isEmpty());
        char pojedynczyZnak = tekst.charAt(tekst.length()-1);
        System.out.println("charAt:"+ pojedynczyZnak);
        tekst.substring(0,5);
        System.out.println(" tekst.substring:"+ tekst.substring(0,5));
         String nowyString = "jhjskh";
        System.out.println("."+ nowyString +".");
        System.out.println("trim:" +"." + nowyString.trim() +".");

        String rozneWielkosciLiter = " Rozne Litery DUZE i male HJik";
        System.out.println("toLowerCase"+ rozneWielkosciLiter.toLowerCase());
        System.out.println("toUpperCase"+ rozneWielkosciLiter.toUpperCase());

        String czyZawiera = "Czy zawiera jakis tekst";
        String czyZawieraMaleZnaki = czyZawiera.toLowerCase();
        String czyZawieraMałeZnakiBezSpacji = czyZawieraMaleZnaki.trim();
        System.out.println("startsWith:"+ czyZawieraMałeZnakiBezSpacji.startsWith("czy"));
        String czyZawieraUproszczony = czyZawiera.toLowerCase().trim();
        System.out.println("startsWith:"+ czyZawieraUproszczony.startsWith("czy"));

        String czyZawieraKoncowke = "Jakis tekst z koncowka";
        System.out.println("endsWith:"+ czyZawieraKoncowke.endsWith("koncowka"));

        System.out.println("Contains:" + czyZawieraKoncowke.contains("tekst"));

        System.out.println("replace:"+ czyZawieraKoncowke.replace('a','b'));


    }
}
