package Petle.Break.Continue;

public class PętlaBreakContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            System.out.println("Przed continue:" + zmienna);
            if(zmienna<18){
                continue;
            }
            System.out.println("Zmienna:" + zmienna);
        }
        for (zmienna = 1; zmienna <= 20; zmienna++){
            if(zmienna==2){
                break;
            }
            System.out.println("Zmienna w drugiej petli:" + zmienna);
        }
    }
}
