package InstrukcjeWarunkowe.Switch;

public class Instrukcje {
    public static void main(String[] args) {
        int zmienna = 1;
        switch(zmienna){
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
        }

       char pojedynczyZnak = 'b';
       switch(pojedynczyZnak){
           case 'a':
               System.out.println("Duze A");
               break;
           case 'b':
               System.out.println("Duze B");
               break;
           case 'c':
               System.out.println("Duze c");
               break;
           default:
               System.out.println("Nie znam tego znaku");
               break;
       }
       int zmienna1=5;
       if(zmienna1 == 1){
           System.out.println("jeden");
       }else if(zmienna1 == 2){
           System.out.println("dwa");
        }else if (zmienna1 == 3){
           System.out.println("trzy");
        }else{
            System.out.println("Inna liczba");
        }
    }
}
