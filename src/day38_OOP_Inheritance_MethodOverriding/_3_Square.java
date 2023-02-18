package day38_OOP_Inheritance_MethodOverriding;

public class _3_Square extends _1_Shape {

    public  double side;  // instance variable

    public _3_Square(double side){  // constructor
        this.side = side;
    }

    @Override
    public double area() {    // should more visible than parent class
        return side * side;
    }
    @Override
    public double perimeter() {
        return side * 4;
    }

    public String toString() {
        return "day38_OOP_Inheritance_MethodOverriding._3_Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
