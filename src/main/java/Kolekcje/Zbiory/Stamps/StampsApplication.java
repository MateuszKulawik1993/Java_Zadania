package Kolekcje.Zbiory.Stamps;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Paris","5cm",true));
        stamps.add(new Stamp("NewYork","6cm",false));
        stamps.add(new Stamp("Berlin","5cm",true));
        stamps.add(new Stamp("Rome","6cm",false));
        stamps.add(new Stamp("Paris","5cm",true));

        System.out.println(stamps.size());
        for(Stamp stamp: stamps){
            System.out.println(stamp);
        }

    }
}
