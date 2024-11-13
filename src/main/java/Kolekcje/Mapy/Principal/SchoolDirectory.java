package Kolekcje.Mapy.Principal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Principal principal1 = new Principal("John", "Newmann");
        Principal principal2 = new Principal("Bill", "Obama");

        School school1= new School(Arrays.asList(30), "Szkola nr1");
        school1.addClass(10);
        school1.addClass(10);
        school1.addClass(10);

        School school2= new School(Arrays.asList(25),"Szkola nr2");
        school2.addClass(15);
        school2.addClass(10);

        Map<Principal,School> schoolDirectory = new HashMap<>();
        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);

        for(Map.Entry<Principal, School> entry: schoolDirectory.entrySet()){
        Principal principal= entry.getKey();
        School school = entry.getValue();
        System.out.println("Principal:"+ principal.getFirstname()+ principal.getLastname());
        System.out.println("School:"+ school.getName());
        System.out.println("Total students:"+ school.getTotalStudents());
        }

    }




}

