package day44_OOP_Abstraction_Interface.practice1;

public class Rectangle extends Shape {

    public double with, length;

    @Override
    public double area() {
        return with * length;
    }
}
