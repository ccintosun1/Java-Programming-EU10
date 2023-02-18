package day38_OOP_Inheritance_MethodOverriding;

public class _2_Circle extends _1_Shape {
    public double radius;                // instance variable
    public static double pi = 3.14;      // static variable

    public _2_Circle(double radius) {   // constructor
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius * radius *pi;
    }
    @Override
    public double perimeter(){
        return 2 * radius * pi;
    }

    public String toString() {
        return "day38_OOP_Inheritance_MethodOverriding._2_Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
