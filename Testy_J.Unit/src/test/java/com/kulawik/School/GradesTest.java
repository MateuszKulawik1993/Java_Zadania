import com.kulawik.School.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {

    @Test
    void CheckArrayLengthWhenIsEmpty() {
        //given
        Grades grades = new Grades();
        //when
        int[] values = grades.getValues();
        //then
        assertEquals(0, values.length);
    }

    @Test
    void CheckArrayWhenTwoGradesAdded() {
        //given
        Grades grades = new Grades();
        grades.add(2);
        grades.add(4);
        //when
        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(4, values[1]);
    }


    @Test
    void getAverage() {
        //given
        Grades grades = new Grades();
        //when
        grades.add(5);
        grades.add(4);
        grades.add(4);
        //then
        assertEquals(4.33, grades.getAverage(),0.01);
    }
    @Test
    void shouldReturnAverageEqualsZeroWhenArrayIsEmpty(){
        //given
        Grades grades = new Grades();
        assertEquals(0,grades.getAverage(),0.01);
    }
}