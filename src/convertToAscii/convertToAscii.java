package convertToAscii;

import java.util.Scanner;

public class convertToAscii {  // Herhangi bir kodun ascii karsiligini bulmak icin.


        public static void main(String[] args) {
            System.out.println("Karakter giriniz=");
            Scanner gir=new Scanner(System.in);

            char karakter = gir.next().charAt(0);
            System.out.println("Girilen Karakter:" +karakter);
            int ascii = karakter;
            System.out.println("Girilen Karakterin Kodu:" +ascii);

        }
    }



