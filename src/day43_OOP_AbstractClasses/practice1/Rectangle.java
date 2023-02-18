package day43_OOP_AbstractClasses.practice1;

public class Rectangle extends Shape {

    public double with, length;

    @Override
    public double area() {
        return with * length;
    }
}
