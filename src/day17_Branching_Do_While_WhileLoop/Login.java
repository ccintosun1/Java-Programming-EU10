package day17_Branching_Do_While_WhileLoop;import java.sql.SQLOutput;import java.util.Scanner;public class Login {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        System.out.println("Please Enter username");        String username = scan.next();        System.out.println("Please Enter password");        String password = scan.next();        if (username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) { // if credentials is correct            System.out.println("Logged in");        } else {            int attempts = 3;            while (!(username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) && attempts > 0) { // while the credentials are invalid, an attempt >0                if (attempts == 1) {                    System.out.println("THIS IS YOUR LAST ATTEMPT");                }                System.out.println("Incorrect username or password, please re-enter");                System.out.println("Please Enter username");                username = scan.next();                System.out.println("Please Enter password");                password = scan.next();                attempts--;            }            if (username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) {                System.out.println("Logged in");            } else {                System.out.println("Your account is locked");            }        }        scan.close();   // account is locked../*2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:                    username: Cydeo                    password: Cydeo123        Ask the user to enter their credentials.                If credentials are matched, your program should print "Logged in."                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."    // username : "Cydeo"        // password : "Cydeo123"        int attempt = 3;        // while (invalid && hasAttempts)    	for(int i = 1; i <= 3; i++){    		if(valid){    			sout("Loged In")    			break;    		}    		if( i==3){    			sout(Your account is locked)    		}    	} */    }}