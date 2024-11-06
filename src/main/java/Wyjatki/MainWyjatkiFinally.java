package Wyjatki;

public class MainWyjatkiFinally {
   static String str="String tekstowo";
    public static void main(String[] args) {

        try{
            System.out.println("WSZYSTKO WIELKA LITERA:"+str.toUpperCase());
            System.out.println("Znak na miejscu 100"+str.charAt(100));
        }catch(NullPointerException e) {
            System.out.println("Poszedl Null");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Poszedl poza zakres");
        }finally {
            System.out.println("Zawsze sie wykonam");
        }
    }
}
