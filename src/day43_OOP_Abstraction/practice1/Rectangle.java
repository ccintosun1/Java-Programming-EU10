package day43_OOP_Abstraction.practice1;

public class Rectangle extends Shape {

    public double with, length;

    @Override
    public double area() {
        return with * length;
    }
}
