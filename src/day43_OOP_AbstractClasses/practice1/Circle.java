package day43_OOP_AbstractClasses.practice1;

public class Circle extends Shape {

    public double radius;
    public static double pi = 3.14;

    @Override
    public double area() {
    return radius * radius * pi;
    }
}
