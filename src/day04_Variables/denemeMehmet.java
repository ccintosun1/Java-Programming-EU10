package day04_Variables;

public class denemeMehmet {

    public static void main(String[] args) {
        int sayac=0;

        for (int i = 100; i < 1000; i++) {
            int max=0;
            int y = i / 100;
            int o = (i % 100) / 10;
            int b = (i % 10);
            int array[] = {y,o,b};

            for (int j = 0; j <3 ; j++) {
                if(array[j] > max)
                    max=array[j];
            }

            int min =array[0];
            for (int k = 1; k <3 ; k++) {
                if(array[k] < min)
                    min = array[k];
            }

            if (max - min == 8) {
                System.out.print(max+"  ");
                System.out.print(min+"   ");
                System.out.println(i);
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}

