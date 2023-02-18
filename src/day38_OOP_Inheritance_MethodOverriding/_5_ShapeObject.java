package day38_OOP_Inheritance_MethodOverriding;

public class _5_ShapeObject {

    public static void main(String[] args) {

        //------------------ circle -------------------------//
        _2_Circle circle = new _2_Circle(5.5);
        //System.out.println(circle.area());     toString Methodu yazmazsan boyle yazmak zorunda kalicaktin.
        //System.out.println(circle.perimeter());

        System.out.println(circle);  // if there is no toString method in the _2_ circle class
                                    // you can see hashcode in this type printing
        // day38_OOP_Inheritance_MethodOverriding._2_Circle{radius=5.5, area=94.985, perimeter=34.54}

        //------------------ square -------------------------//
        _3_Square square = new _3_Square(12.5);
        System.out.println(square);
        //day38_OOP_Inheritance_MethodOverriding._3_Square{side=12.5, area=156.25, perimeter=50.0}

        //------------------ rectangle -------------------------//
        _4_Rectangle rectangle = new _4_Rectangle(3.5,7.7);
        System.out.println(rectangle);
        //day38_OOP_Inheritance_MethodOverriding._4_Rectangle{with=7.7, length=3.5, area=26.95, perimeter=53.9}
    }
}
