package Abstrakcje.zadanie2;

public class Aplication {
    public static void main(String[] args) {
        Square square = new Square(10,10);
        System.out.println("Area of the sguere is:");
        square.getArea();
        System.out.println("Filed of the sguere is:");
        square.getField();

        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("Area of the rectangle is:");
        rectangle.getArea();
        System.out.println("Field of the rectangle is:");
        rectangle.getField();

    }
}
