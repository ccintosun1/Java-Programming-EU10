package day41_Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _5_Throw_Keyword2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        // BUNLARI ONE NOTE DA COK GUZEL ANLATTIM

        //throw new ArithmeticException("Wrong Calculation");

        // throw new InterruptedException();

        System.out.println("---------- EXAMPLE --------------------");

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if ( age < 0 || age > 130){
            throw new InputMismatchException("Invalid Age: "+age);
        }

        System.out.println("age = " + age);


    }
}
