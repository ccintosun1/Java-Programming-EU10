package day40_FinalKeyword;

public class _1_FinalVariables {

    public final String language;  // final oldugu icin constructer create etmek zorunlu
    public final static double PI;

    public _1_FinalVariables(String language) {
        this.language = language;
       // this.language = "Python";    You canNOT reassign final variable in the constructor.
    }

    static{
        PI = 3.14;
    }


    public static void main(String[] args) {

        final int number = 10;

        // number = 20;     You cannot reassign final variable

        System.out.println(number);
    }
}
