package Kolekcje.Zbiory.HashSet;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> names= new java.util.HashSet<>();
        names.add("Lukasz");
        names.add("Mateusz");
        names.add("Michal");

        for(String name:names){
            System.out.println(name);
        }
        System.out.println(names.size());
        System.out.println(names.contains("Mateusz"));

    }
}
