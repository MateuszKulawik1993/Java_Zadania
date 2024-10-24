package ProgramowanieObiektowe.zadanie3;

public class main {
    public static void main(String[] args) {
        Zwierze pies1 = new Zwierze("Burek", 5);
        Zwierze pies2 = new Zwierze("Reksio", 3);

        pies1.dajGlos();
        pies1.getWiek();
        pies1.getImie();

        pies2.dajGlos();
        pies2.getWiek();
        pies2.getImie();

        System.out.println("Pies1 to"+ " "+ pies1.getImie()+" "+"i ma" +" "+pies1.getWiek()+" "+"lat.");
        System.out.println("Pies2 to"+ " "+ pies2.getImie()+" "+"i ma" +" "+pies2.getWiek()+" "+"lata.");






    }


}
