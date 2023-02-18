package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        /*diameter : cap, radius : yaricap
          perimeter : cevre, area : alan, PI : pi sayisi 3.14

        /* Question 3 : create a class named Circle, write a program that can calculate
         the area & perimeter of any given circle PI, radius, the matter, Maria, perimeter */

        // En onemli nokta ASSIGN THE RIGHT VARIABLE

        //A: π.r2.a/360 : belli bir acinin alani //   Tum alan A= π.r2

        float PI = 3.14f;    // double yazmaka hepsini daha mantikli.
        float radius = 10f;  // bunlara DATA demeyin bunlar VARIABLE...

        float diameter = radius * 2;  // cap :  10*2
        float area = radius * radius *PI;   // 10 * 10 * 3.14
        float primeter = diameter * PI;   // cevre : cap * PI

        System.out.println("radius   = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area     = " + area);
        System.out.println("primeter = " + primeter);





    }


}
