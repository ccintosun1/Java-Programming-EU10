package day43_OOP_AbstractClasses.practice1;

public class Square extends Shape {

public double side;

    @Override
    public double area() {
        return side * side;
    }
}
