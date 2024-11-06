package Petle.zadania;

public class Zadanie8 {
    public static void main(String[] args) {
        int n =5;
        int liczbaGwiazdekLustrzanych = 1;
        int liczbaSpacjiLustrzanych= n-1;

        for(int i = 1; i<=n;i++) {
            for (int j = 1; j <= liczbaSpacjiLustrzanych; j++) {
                System.out.println(" ");
            }
            for(int j = 1; j<=liczbaGwiazdekLustrzanych;j++){
                System.out.println("*");
            }
            System.out.println();
            liczbaSpacjiLustrzanych--;
            liczbaGwiazdekLustrzanych++;
        }
    }
}
