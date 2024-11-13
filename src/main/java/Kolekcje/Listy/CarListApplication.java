package Kolekcje.Listy;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<String>cars = new ArrayList<>();

        cars.add("Ford");
        cars.add("BMW");
        cars.add("Renalut");
        cars.add("Mercedes");

        System.out.println(cars.size());
        System.out.println(cars.contains("Ford"));
        System.out.println(cars.remove("BMW"));


        for(String car : cars){
            System.out.println("Cars:"+ car);
        }



    }
}
