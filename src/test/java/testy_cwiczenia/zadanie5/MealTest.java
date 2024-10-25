package testy_cwiczenia.zadanie5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MealTest {
    @Test
    void shouldReturnDiscountedPrice(){
        //given
        Meal meal = new Meal(35);
        //when
        int discountedPrice = meal.getDiscountPrice(7);
        //then
        assertEquals(28,discountedPrice);
    }
    @Test
    void referncesToTheSameObjectsShouldBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 =meal1;
        //then
        assertSame(meal1,meal2);
    }
    @Test
    void referncesToTheDifferntObjectsShouldBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 =new Meal(20);
        //then
        assertNotSame(meal1,meal2);
    }
    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAretheSame(){
        //given
        Meal meal1 = new Meal(10,"Pizza");
        Meal meal2 = new Meal(10,"Pizza");

        //then, nadpisanieMetodyEquals,"Hashcode, metoda Equals"
        assertEquals(meal1,meal2);
    }
}
