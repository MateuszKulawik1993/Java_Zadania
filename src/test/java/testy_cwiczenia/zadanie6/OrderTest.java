package testy_cwiczenia.zadanie6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    void testAssertArrayEquals(){

        //given
        int[] ints1= {1,2,3};
        int[] ints2 ={1,2,3};

        //then
        assertArrayEquals(ints1,ints2);
    }

}
