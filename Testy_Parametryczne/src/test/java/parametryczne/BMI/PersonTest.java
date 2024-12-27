package parametryczne.BMI;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    @ParameterizedTest
    @CsvSource({
            "1.80, 50, Very severely underweight",
            "1.80, 52, Severely underweight",
            "1.80, 60, Underweight",
            "1.80, 75, Normal (healthy weight)",
            "1.80, 90, Overweight",
            "1.80, 100, Obese Class I (Moderately obese)",
            "1.80, 120, Obese Class II (Severely obese)",
            "1.80, 140, Obese Class III (Very severely obese)",
            "1.80, 160, Obese Class IV (Morbidly Obese)",
            "1.80, 200, Obese Class V (Super Obese)",
            "1.80, 250, Obese Class VI (Hyper Obese)"
    })
    void shouldReturnCorrectBMICategory(double heightInMeters, double weightInKilogram, String expectedCategory) {
        // given
        Person person = new Person(heightInMeters, weightInKilogram);

        // when
        String result = person.getBMI();

        // then
        assertEquals(expectedCategory, result);
    }
}