package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2018",
                make = "Toyota",
                model = "Cambry",
                miles = "5000 miles",
                color = "Red",
                price = "$19_000";

        String toyota = year+" "+make+" "+model+", "+miles+", "+color+", "+price+".";
        System.out.println(toyota);


    }



}
