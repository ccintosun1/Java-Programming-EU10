package day08_IfStatements;public class EligibleToVote {    public static void main(String[] args) {        String name = "Josh";        int age = 38;        String citizen = "USA";        boolean isEligible = age >= 21 && citizen == "USA";        //Eligible        if(isEligible){ // true            System.out.println(name +" is Eligible to Vote"); //Josh is Eligible to Vote        }        //Not Eligible        if(!isEligible){ // false            System.out.println(name + " is Not Eligible to Vote");        }    }}