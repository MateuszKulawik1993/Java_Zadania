package KlasaAbstarkcyjna;

public class MainKlasaAbstrakcyjna {
    public static void main(String[] args) {
        KlasaZwykla klasaZwykla = new KlasaZwykla();

        klasaZwykla.metodaAbstrakcyjna();
        klasaZwykla.metodaZparamterem("100");
        klasaZwykla.jakasMetoda();

        Pies pies = new Pies();
        Kot kot = new Kot();
        Kon kon = new Kon();

        System.out.println("Dla psa");
        pies.przemieszczanieSie();
        pies.wydajDzwiek();
        pies.karmieneiPotomstwa();
        pies.podajLiczbekonczyn();
        pies.temperaturaCiala();

        System.out.println("Dla konia");
        kon.przemieszczanieSie();
        kon.wydajDzwiek();
        kon.karmieneiPotomstwa();
        kon.podajLiczbekonczyn();
        kon.temperaturaCiala();

    }
}
