package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 18.42;
        double euro = dollar * 0.991;

        System.out.println(dollar +" dollar is equals to " + lira+ " Turkish lira");
        
        // jpy, pound, peso, canadianDollar

        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.24;

        System.out.println(dollar+" dollar is equal to " +"euro = " + euro);
        System.out.println(dollar+" dollar is equal to " +"jpy = " + jpy);
        System.out.println(dollar+" dollar is equal to " +"pound = " + pound);
        System.out.println(dollar+" dollar is equal to " +"CAD = " + CAD);








    }



}
