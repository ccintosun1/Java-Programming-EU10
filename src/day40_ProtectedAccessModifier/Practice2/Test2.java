package day40_ProtectedAccessModifier.Practice2;

import day40_ProtectedAccessModifier.Practice1.AccesModifier;

public class Test2 extends AccesModifier {

    public static void main(String[] args) {

        System.out.println(AccesModifier.protectedVar);

        AccesModifier.method1();

    }
}
