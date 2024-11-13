package com.kulawik.School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {

    @Test
    void shouldCalculateCorrectAverageIfValuesAreInRange() {
        //given
        Student student = new Student("Martin");
        //when
        student.addMathGrade(5);
        student.addMathGrade(4);

        student.addGeographyGrade(3);

        student.addPhysicsGrade(5);
        student.addPhysicsGrade(3);
        //then
        double mathsAverage = student.getMathsAverage();
        double geographyAverage = student.getGeographyAverage();
        double physicsAverage = student.getPhysicsAverage();
        double historyAverage = student.getHistoryAverage();

        assertEquals(4.5,mathsAverage,0.01);
        assertEquals(3.0,geographyAverage,0.01);
        assertEquals(4.0,physicsAverage, 0.01);
        assertEquals(0,historyAverage, 0.01);

    }

    @Test
    void averageShouldBeZeroWhenStudentDoesNotHaveAnyGrades () {
        //given
        Student student = new Student("Martin");
        //when
        student.getAverage();
        //then
        assertEquals(0,student.getAverage(),0.01);

    }

    @Test
    void shouldCalculateStudentAverage() {
        Student student = new Student("Martin");
        student.addMathGrade(4);
        student.addMathGrade(5);

        student.addPhysicsGrade(4);
        student.addPhysicsGrade(4);

        student.addGeographyGrade(3);

        student.addHistoryGrade(5);
        student.addHistoryGrade(5);

        assertEquals(4.285,student.getAverage(),0.01);

    }

}