package foodApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;
    private MenuItem pizza;
    private MenuItem burger;

    @BeforeEach
    void setUp() {
        pizza = new MenuItem(25.0, "Pizza");
        burger = new MenuItem(15.0,"Burger");
    }
    @Test
    void addItemTest(){
        order.addItem(pizza);
        assertEquals(1, order.getItem().size());
        assertTrue(order.getItem().contains(pizza));
    }


}