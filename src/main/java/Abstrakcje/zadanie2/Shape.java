package Abstrakcje.zadanie2;

public abstract class Shape {
    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void getField();
    public abstract void getArea();
}
