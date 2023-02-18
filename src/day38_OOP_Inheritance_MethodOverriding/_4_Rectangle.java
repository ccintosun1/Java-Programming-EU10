package day38_OOP_Inheritance_MethodOverriding;

public class _4_Rectangle extends _1_Shape{
    public double with;
    public double length;
    public _4_Rectangle(double length, double side) {
        this.length = length;
        this.with = side;
    }

    @Override
    public double area() {
        return with * length;
    }
    @Override
    public double perimeter() {
        return 2 * with * length;
    }

    @Override
    public String toString() {
        return "day38_OOP_Inheritance_MethodOverriding._4_Rectangle{" +
                "with=" + with +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
