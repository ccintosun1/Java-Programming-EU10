package day44_OOP_Abstraction_Interface.practice1;

public class Cube extends Shape implements Volume{

    public double side;

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {  // yukarida variable lari yazip asagida formulu yazarsin.
        return side * side * side;
    }
}
