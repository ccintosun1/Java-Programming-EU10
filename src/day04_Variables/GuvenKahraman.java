package day04_Variables;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuvenKahraman {

    public static void main(String[] args) {

        List<Integer> Sayilar = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int sayi = Calculate(i);
            if (sayi == -1) {

            } else {
                Sayilar.add(sayi);
            }
        }

        System.out.println(Sayilar);
    }

    public static int Calculate(int num) {

        int sayi = num;

        String sayiString = Integer.toString(sayi);

        int sayi0 = -1, sayi1 = -1, sayi2 = -1;

        sayi0 = Integer.parseInt(String.valueOf(sayiString.charAt(0)));
        if (sayi > 9) {
            sayi1 = Integer.parseInt(String.valueOf(sayiString.charAt(1)));
        }
        if (sayi > 99) {
            sayi2 = Integer.parseInt(String.valueOf(sayiString.charAt(2)));
        }

        List<Integer> liste = new ArrayList();
        if (sayi0 > -1) {
            liste.add(sayi0);
        }
        if (sayi1 > -1) {
            liste.add(sayi1);
        }
        if (sayi2 > -1) {
            liste.add(sayi2);
        }

        Collections.sort(liste);

        int buyuk = liste.get(liste.size() - 1);
        int kucuk = liste.get(0);

        if (buyuk - kucuk == 8) {
            return sayi;
        } else {
            return -1;
        }
    }


}
