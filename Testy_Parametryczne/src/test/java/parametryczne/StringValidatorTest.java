package parametryczne;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    @Test
    void shouldReturnFalseIfStringIsNotEmpty() {
        //given
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank("tekst");
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank("");
        assertTrue(result);

    }

    @Test
    void shouldReturnTrueIfStringHasOnlySpaces() {
        //given
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank("   ");
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //given
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank(null);
        //then
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings={""," "} )
    void ShouldReturnTrueWhenStringIsEmpty(String text){
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank(text);
        //then
        assertTrue(result);
    }
    @ParameterizedTest
    @NullSource
    void ShouldReturnTrueWhenStringIsNull(String text){
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank(text);
        //then
        assertTrue(result);
    }
    @ParameterizedTest
    @EmptySource
    void ShouldReturnTrueWhenStringIsEmpty1(String text){
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank(text);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void ShouldReturnTrueWhenStringIsEmptyOrNull(String text){
        StringValidator stringValidator = new StringValidator();
        //when
        boolean result = stringValidator.isBlank(text);
        //then
        assertTrue(result);
    }


}