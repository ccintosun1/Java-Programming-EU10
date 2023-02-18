package day04_Variables;

public class RectangleBox {

    public static void main(String[] args) {
        //lenght, width, area, primeter

        double length = 10;
        double width = 5;
        double hight = 8;

        double primeter = (length + width) * 2;     // cevre
        double area = length * width;              // alan
        double volume = area* hight;              // hacim

        System.out.println("primeter = " + primeter+ " cm");
        System.out.println("area     = " + area+ " cm");
        System.out.println("volume   = " + volume+" cm2");




    }






}
