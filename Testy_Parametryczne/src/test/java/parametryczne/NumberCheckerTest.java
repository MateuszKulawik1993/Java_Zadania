package parametryczne;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    void shouldReturnTrueWhenNumberEqualsThree() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(3);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenNumberIsMultiplyOfThree() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(12);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenNumberIsEqualsZero() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(0);
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenNumberIsEqualsFour() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(4);
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnTrueWhenNumberIsNegativeMultiplyOfThree() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(-9);
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenNumberIsNotNegativeMultiplyByThree() {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisiblyByThree(-4);
        //then
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints={-6,-3,0,3,6,12,15})
    void shouldReturnTrueForNumberDivisibleByThree(int number){
        //given
        NumberChecker numberChecker = new NumberChecker();
        boolean result= numberChecker.isDivisiblyByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints={-5,-2,1,4,5,7})
    void shouldReturnFalseForNumberNotDivisibleByThree(int number){
        //given
        NumberChecker numberChecker = new NumberChecker();
        boolean result= numberChecker.isDivisiblyByThree(number);
        assertFalse(result);
    }


}