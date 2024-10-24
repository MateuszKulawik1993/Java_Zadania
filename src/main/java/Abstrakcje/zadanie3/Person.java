package Abstrakcje.zadanie3;

public class Person {
    public static void main(String[] args) {

        Doctor doctor = new Doctor(8000, "treating peaple");
        int age = 31;
        String firstName ="John";
        String job = "Doctor";
        doctor.whatResposibleFor();
        doctor.earnMoney();
        System.out.println("My name is" + " " + firstName + " " + "I am a" + " " + job + " "+" "+ doctor.responsibility);

        QaAssurance qaAssurance = new QaAssurance(10000,"Software testing");
        qaAssurance.earnMoney();
        qaAssurance.whatResposibleFor();

    }
}
