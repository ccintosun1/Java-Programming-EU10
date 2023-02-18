package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a= 100;
        short b = a;
        //       (short)a

        int c = b;
        // int c = (int)b;   in the back round islemi bunu yapiyor

        long d = c;
        //

        //-------------IMPLICIT--------------------
        // changing small to bigger
        int first = 500;
        long second = first;       // kucugu buyuge cevirken direk yapiyoruz.

        //-------------EXPLICIT--------------------
        //changing big to small
        double num1 = 2.5;
        float num2 = (float) num1;  //buyugu kucuge cevirirken kuculttugumuz variableDataType
                                     // ismini yaziyoruz. Thats all.
        System.out.println("num2 = " + num1);

        double n = 10.8;
        int    s = (int)(long)n; // once n yi long yap sonra int e cevir. Yani s artik 10

        double x = 22.885;
        int y = (int) x;  // y = 22

        System.out.println(x +" : "+y);

        float v = 10000.8f;
        // long  z =  v;   // shortcut is option + Enter
        long z = (long) v;






    }



}
