package day10_NestedIf;public class TernaryDaysOfWeek {    public static void main(String[] args) {    /*2. write a program that can display the name of the daynumber = 1 ~ 7*/        int day = 9;        String dayName = "Invalid";        if (day == 1) {            dayName = "Monday";        } else if (day == 2) {            dayName = "Tuesday";        } else if (day == 3) {            dayName = "Wednesday";        } else if (day == 4) {            dayName = "Thursday";        } else if (day == 5) {            dayName = "Friday";        } else if (day == 6) {            dayName = "Saturday";        } else if (day == 7) {            dayName = "Friday";        } else {            System.out.println("Invalid Entering Please Enter Valid Day Number");        }        System.out.println("day = " + dayName);        //------------------------------------------------------------        int n=3;        String dayNameOfWeek = (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":"Sunday";        System.out.println("dayNameOfWeek = " + dayNameOfWeek);    }}