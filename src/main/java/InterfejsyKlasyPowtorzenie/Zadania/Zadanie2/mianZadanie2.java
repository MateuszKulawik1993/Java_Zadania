package InterfejsyKlasyPowtorzenie.Zadania.Zadanie2;

public class mianZadanie2 {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(10.5);
        Prostokat prostokat = new Prostokat(5.0,10.0);

        kolo.obwod();
        kolo.pole();
        System.out.println("kolo.obwod():"+ kolo.obwod());
        System.out.println("kolo.pole():"+ kolo.pole());

        prostokat.obwod();
        prostokat.pole();
        System.out.println("prostokat obwod():"+ prostokat.obwod());
        System.out.println("prostokat pole():"+ prostokat.pole());
    }
}
