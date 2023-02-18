package day34_GarbageCollection_AccesModifiers;

import static day34_GarbageCollection_AccesModifiers._02_Circle.*;

public class _06_StaticImport {

    public static void main(String[] args) {

        //System.out.println(_02_Circle.pi);  // import ettigin icin artik Class name e ihtiyacin yok.
        System.out.println(pi);    // 3.14         // direkt boyle yazabilirsin
        System.out.println(name);  // Circle
        System.out.println(numbers); // [10, 20]


    }
}

/*
2.Statatic Import :

   import static packageName.className.staticMember;  // import one static member of a class

import static packageName.className.*;            // imports all the static members of the class
 */