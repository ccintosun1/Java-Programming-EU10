package day44_OOP_Abstraction_Interface.practice2;

//-------------------------- interface class ------------------------//
interface A {

    int a = 100;  // static and final  // public disinda access modifier kabul etmez.


    //-------------- instance method
    // public void method1() {    // instance method compile error
   //     }


    //-------- default keywordlu method -------//
    public default void method4(){   // default keyword lu method ( default burda access modifiers degil)

    }

    //------------ static method -------//
    public static void method2() {   // static method

    }

    //-------- by default abstract method ---------//
    void method3();     // by default abstract method



}

//----------------------------- abstract class -----------------------//
abstract class X {

    private int a;   // any access modifiers you can use
    static int b;

    public X() {     // You can use constructer

    }

    //------ abstract method --------//
    public abstract void method5();


    //------ instance method bodysiz --------//
    // public void method6(); compile error


    //------ instance method body li --------//
    public void method7() {


    }



}

public class Abstract_vs_Interface {
    public static void main(String[] args) {

        // A obj1 = new A(); you cannot create object to call interface class

        // X obj2 = new X() ; you cannot create object to call abstract class


    }
}
