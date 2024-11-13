package Kolekcje.Mapy.Principal;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsPerClass;
    private String name;

    public School(List<Integer> studentsPerClass, String name) {
        this.studentsPerClass = studentsPerClass;
        this.name = name;
    }

    public List<Integer> getStudentsPerClass() {
        return studentsPerClass;
    }

    public String getName() {
        return name;
    }
    public void addClass(int numberOfStudents){
        studentsPerClass.add(numberOfStudents);
    }

    public int getTotalStudents(){
        int total =0;
        for(int students: studentsPerClass){
            total+= students;
        }
        return total;

    }
}
