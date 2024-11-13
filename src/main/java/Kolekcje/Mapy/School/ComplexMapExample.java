package Kolekcje.Mapy.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John","Stevenson");
        Student jesse = new Student("Jesse","Pinkman");
        Student bart = new Student("Bart","Simpson");

        Grades johnGrades = new Grades(Arrays.asList(5.0,4.0,4.5,5.0,5.0));
        Grades jesseGrades = new Grades(Arrays.asList(2.5,3.0,2.0));
        Grades bartGrades = new Grades(Arrays.asList(4.0,4.0,4.0, 4.0,5.0));


        school.put(john, johnGrades);
        school.put(jesse, jesseGrades);
        school.put(bart, bartGrades);

        System.out.println(school.get(john));

        for(Map.Entry<Student,Grades> grades: school.entrySet()){
            System.out.println(grades.getKey().getFirstname() + " "+"Average:"+ grades.getValue().getAverage());
        }

    }
}
