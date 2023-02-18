package day03_EscapeSequences;

import java.util.Scanner;

public class MyTimer {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the number of hours");
        int hours = scan.nextInt();
        System.out.println("please enter the number of minutes");
        int minutes = scan.nextInt();
        int seconds;

        for (int h = hours; h >= 0; h--) {
            for (int m = minutes; m > 0; m--) {
                for (seconds = 59; seconds > 0; seconds--) {
                    if (m == 0) {
                        h = h - 1;
                    }

                    String mesaj = "\r" + (h) + "h " + +(m - 1) + "m " + seconds + "s";
                    System.out.print(mesaj);
                    Thread.sleep(1000);
                    if (h == -1 && m == 0 && seconds == 0) {
                    }
                    scan.close();

                }
                minutes = 60;

            }


            System.out.println("\n\n");

            System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.err.println("\t\t\t*                                                 *");
            System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
            System.err.println("\t\t\t*                                                 *");
            System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

        }


    }
}