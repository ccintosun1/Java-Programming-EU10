package day44_OOP_Interface_vs_Implements;

interface A {

}

interface B{

}
interface C extends A,B  {

}


abstract class X extends Y implements A,B,C { }

class Y  {

    public void Constructor(){

    }
}



class Z extends X implements A,B,C  { }


public class Extends_vs_Implements extends X implements A,B{

}


/*
-NOT : Ikisinin de amaci inheritance yapmaktir.
-Extends   : class can allaw Extents one class
-Interface : class can allow implements one or more than one / Multiple interfaces
we use implements keyword to use interface class

-Interface only extentds another interface
 */