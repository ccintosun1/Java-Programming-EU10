package day03_EscapeSequences;

import java.util.Scanner;

public class GuvenTimer {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("please  enter the number for hours");
        int hours = scan.nextInt();
        System.out.println("please enter the number of minutes");
        int minutes = scan.nextInt();


        scan.close();

        for (int h = hours; h > 0; h--) {
            for (int i = minutes; i > 0; i--) {
                for (int z = 5; z >= 0; z--) {
                    System.out.print("\r" + (h -1) + " hours and " + (i - 1) + " minutes and " + z + " seconds left");
                    Thread.sleep(1000);
                }
            }
            minutes = 59;
        }


            System.out.println("\n\n");

            System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.err.println("\t\t\t*                                                 *");
            System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
            System.err.println("\t\t\t*                                                 *");
            System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

        }


    }
