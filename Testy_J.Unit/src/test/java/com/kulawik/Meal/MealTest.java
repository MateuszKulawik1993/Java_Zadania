package com.kulawik.Meal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MealTest {

    @Test
    void ShouldReturnDiscountedPrice() {
        //given
        Meal meal = new Meal(35);
        //when
        int discountedPrice = meal.getDiscountedPrice(8);
        //then
        assertEquals(27,discountedPrice);
    }
    @Test
    void referencesToTheSameObjectShouldBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;
        //then
        assertSame(meal1,meal2);
    }
    @Test
    void referencesToTheDifferentObjecstShouldNotBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(20);
        //given
        assertNotSame(meal1,meal2);
    }
    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame(){
        //given
        Meal meal1 = new Meal(20,"Burger");
        Meal meal2 = new Meal(20,"Burger");
        assertEquals(meal1, meal2);
    }
}