package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age :33 years old

        byte age = 38;

        // weight : 160 pound
        // byte weight = 160; byte cannot higher than 127 between -127
        // byte num = -129; // -129 is out of byte` range

        short weight = 160;  // 160 is within the range of short

        // salary: 275000 $
        //short salary = 275000; // 275000$ is out of the range of short (short + 32.767 / -32.768)
        int salary = 275_000; // prefer data type for integer numbers.

        // int asset = 3_333_333_333; We cannot use int data type, we have to use long

        long asset = 3_333_333_333l;  //eger sonuna l koymaz isen bunu hala int diye degerlendirir.


        //tax rate: 0.26
        // int tax=0.26;  // you cannot use int byte short and long

        double tax = 0.25; // you cannot add d at the and of the value.
        float tax2 = 0.26f;  // f or F you can use

        //------------------------------------------------------------------

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 65535;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F';    // N: North S:South  E:East  W:Weast

        char yesNo = 'Y';

        // char ch4 = 'AB'; We cannot use AB / We can only use single character.

        //------------------------------------------------------

        boolean isEmployeed = true;
        boolean isMArried = false;
        boolean result = 100>300;   // result will be false

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMArried   = " + isMArried);
        System.out.println("result      = " + result);

        //-------------------------------------------------------

        // char name = " Wooden Spoon"; it is not possible Because char is would be single character

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name$ = "Muhtar";
        int num1 = 100;
        int num2 = 200;

        // int private = 300;

        double salaryAfterTax = 2.5;
        /* int salaryAfterTax = 3.5;  You cannot use same name for
        the other variable Because varible name musts be unic */






    }


}
