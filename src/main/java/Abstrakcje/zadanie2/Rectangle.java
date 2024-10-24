package Abstrakcje.zadanie2;

public class Rectangle extends Shape{
    public Rectangle(int a, int b) {
        super(a, b);
    }

    public void getField(){
        System.out.println(a*b);
    }

    public void getArea(){
        System.out.println(2*a+2*b);
    }
}
