package Kolekcje.Listy.listaArray;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();
        names.add("Pawel");
        names.add("Tomek");
        names.add("Lukasz");
        names.add("Bartek");

       for(String name:names){
           System.out.println(name);
       }

        System.out.println(names.get(1));
        System.out.println(names.indexOf("Pawel"));
        System.out.println(names.contains("Tomek"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

    }
}
