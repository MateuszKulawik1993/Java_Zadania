package Operatory;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        //ang. logical operators
        int wiek = 20;
        // koniungcja (and)

        System.out.println(wiek >=18 && wiek<30);
        System.out.println(wiek >30 && wiek<50);

        //alternatywa (or)

        System.out.println(wiek <18 || wiek>65);
        System.out.println(wiek <=20|| wiek>65);

        //negacja
        boolean prawda = true;
        System.out.println("!prawda:"+ !prawda);

        boolean falsz = false;
        System.out.println("!falsz:"+ !falsz);


    }
}
