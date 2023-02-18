package day04_Variables;

public class GallonsToLitters {

    /* 5. Create a class named gallons to litters, write a program
     that can convert gallon (int )to liter (double)
     Hints : 1 gallon = 3.79 Litters */

    public static void main(String[] args) {

        int gallons = 1000;

        double litter = gallons * 3.79;

        System.out.println("gallons = " + gallons);
        System.out.println("litter  = " + litter);

    }

}