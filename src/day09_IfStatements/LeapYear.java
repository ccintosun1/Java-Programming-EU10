package day09_IfStatements;public class LeapYear {    public static void main(String[] args) {        int year = 2000;        boolean leapYear = year % 4 == 0;        //----------------FIRST POSSIBILITIES-----------------------        if (leapYear) {            System.out.println("Year " + +year + " is a leap year");        }        if (!leapYear) {  // java compiler write line by line            System.out.println("Year " + +year + " is NOT a leap year");        }        System.out.println("--------------------------------");        //------------ SECOND POSSIBILITIES (TRUE WAY)-------------        if (leapYear) {            System.out.println("Year " + +year + " is a leap year");        } else {   // if true java compiler passes else line without write            System.out.println("Year " + +year + " is NOT a leap year");        }    }}