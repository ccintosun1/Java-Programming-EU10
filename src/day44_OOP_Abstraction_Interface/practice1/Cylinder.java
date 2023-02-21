package day44_OOP_Abstraction_Interface.practice1;

public class Cylinder extends Shape implements Volume {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
