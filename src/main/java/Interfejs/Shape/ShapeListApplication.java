package Interfejs.Shape;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {
    public static void main(String[] args) {
        List<Square> shapes= new ArrayList<>();
        Square square1 = new Square(10.0);
        Square square2 = new Square(5.0);
        Square square3 = new Square(1.0);

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);

        for(int n = 0; n<shapes.size();n++){
            Square square = shapes.get(n);
            if(square.getArea()>20)
            System.out.println(square + "+, area:" + square.getArea());
        }

    }
}
