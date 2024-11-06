package InstrukcjeWarunkowe.If;

public class Instrukcje {
    public static void main(String[] args) {
        // ang. conditional statements

       int wiek =10;
        boolean przyszedlTata= false;
        boolean przyszedlZMama= false;

       if(wiek>=18){
           System.out.println("Pozwol na zakup...");
       } else if(przyszedlTata==true) {
           System.out.println("Od razu podaj");
       }else if(wiek<=18 && przyszedlZMama ){
               System.out.println("Pozwól na zakup");
       }else{
           System.out.println("Wypros ze sklepu");
       }
    }
}
