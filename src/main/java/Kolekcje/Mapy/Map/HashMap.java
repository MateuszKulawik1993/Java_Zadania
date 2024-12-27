package Kolekcje.Mapy.Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> names = new java.util.HashMap<>();

        names.put(1, "Lukasz");
        names.put(2, "Bartek");
        names.put(3, "Michal");

        for(Map.Entry<Integer,String> name: names.entrySet()){
            System.out.println(name);
        }
        System.out.println(names.get(1));
        System.out.println(names.size());
        System.out.println(names.containsKey(1));
        System.out.println(names.remove(3));

    }
}
