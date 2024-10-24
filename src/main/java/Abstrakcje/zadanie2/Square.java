package Abstrakcje.zadanie2;

public class Square extends Shape {
    public Square(int a, int b) {
        super(a, b);
    }
    public void getField(){
        System.out.println(a*a);
    }

    public void getArea(){
        System.out.println(4*a);
    }

}

