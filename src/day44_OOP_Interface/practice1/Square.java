package day44_OOP_Interface.practice1;

public class Square extends Shape {

public double side;

    @Override
    public double area() {
        return side * side;
    }
}
