package day08_IfStatements;public class LogicalOperators {    public static void main(String[] args) {        String name = "Steven";        int age = 19;        String citizen = "UK";        boolean isEligible = age >= 18 && citizen == "USA";   // true or false        //                    19 >=18   &&  "UK" == "USA"        //                      true            false    ====> false        System.out.println(name + " is eligible to vote: " + isEligible);        //-----------------------------------------------------------------        String name2 = "Josh";        int creditScore = 720;        int age2 = 23;        int income = 40000;        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;        //                    true                     true          false =======> false        System.out.println(name2 + " is eligable for loan:  = " + isEligible2); // false        //-------------------------------------------------------------------        String name3 = "Daniel";        int age3 = 21;        char gender = 'F';        boolean isEligible3 = age >= 18 && (gender == 'M' || gender == 'F');        //                      true  &&   (   false      ||      true   )        //                      true  &&                true        //                      true  &&   true ======> TRUE        System.out.println(name3 + " is eligible to register: " + isEligible3);        //---------------------------------------------------------------------        String name4 = "James";        String countryOfBirth = "UK";        boolean marriedToUSCitizen = false;     // false olmasi lazim        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true; // Biz false ariyoruz.        //                                  false     ||          false ======> false        //                                          false        System.out.println(name4 + " is eligible to apply for US citizenShip::" + isEligible4); // false        // We are changing the countroOfBirth        countryOfBirth = "USA";        isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;        //                      true          ||            false        //                                   true        System.out.println(name4 + " is eligible to apply for US citizenShip::" + isEligible4); // true        //---------------------------------------------------------------        String student = "Anna";        double gpa = 2.5;  //GPA (grade point average) in the US on a scale of 0 to 4.        int familyIncome = 100000;        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;        //                      false   ||    false   =====> false        System.out.println(student + "is eligible for scholarship: " + isEligible5); //false        familyIncome = 40000;  // family income is changed        isEligible5 = gpa >= 3.5 || familyIncome <= 60000;        //              false   ||       true  =====> true        System.out.println(student + "is eligible for scholarship: " + isEligible5); // true        //---------------------------------------------------------------------------------        boolean result2 = true;        System.out.println("result2 = " + result2); // true        boolean result3 = !result2;        System.out.println("result3 = " + result3); // false        //------------------------------------------------------------------------        int score = 85;        boolean passed = score >= 60;        boolean failed = !passed;        System.out.println("passed = " +passed); // true        System.out.println("failed = " + failed);  // false        //------------------------        score = 55;        passed = score >= 60;        failed = !passed;        System.out.println("passed = " +passed); // false        System.out.println("failed = " + failed); // true    }}