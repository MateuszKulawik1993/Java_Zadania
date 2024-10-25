package testy_cwiczenia.zadanie6;

import testy_cwiczenia.zadanie5.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Meal>meals = new ArrayList<>();

    public void addMealToOrder(Meal meal){
        this.meals.add(meal);
    }
    public void removeMealFromOrder(Meal meal){
        this.meals.remove(meal);
    }
    public List<Meal> getMeals(){
        return meals;
    }

}
