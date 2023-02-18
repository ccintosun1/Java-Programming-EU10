package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "Jossune";   //or you can use " " between firstName and lastName
        String jobTitle = "SDET";
        String companyName = "Walmart";
        double salary = 157_000.58;

        String fullName = firstName + " "+ lastName;
        System.out.println("\t\tfullName = " + fullName);

        //Full name of the person is _________
        System.out.println("\t\tFull name of the person is = " + fullName);

        // __ is ___ years old
        System.out.println("\t\t"+fullName+ " is "+45 + " years old");

        //FullName is JobTitle, works at CompanyName
        System.out.println("\t\t" +fullName+" is " +jobTitle+  "works at " +companyName +"\n\t\tHe is also an Personal Trainer and His salary is "+salary+"$" );

    }





}
