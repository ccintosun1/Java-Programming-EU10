package day34_GarbageCollection_AccesModifiers;

public class _05_StaticMembers {   // public class static olmaz

    int a;   // instance variable.

    static class class1 {    // inner class static olmali

    }

    public static int num = 100;

    public static void method() {

    }

    static {

    }

}

// Nested class

class A {      // outer class // we cannot use static because this class doesn't belong to any other class

    static class B {  // inner class  // static means it has to belong to a class

        public static void method1() {

        }

    }
}

// How can i call method1 in the class C ?
// Answer :
class C {
    public static void main(String[] args) {

        A.B.method1();

    }
}

/*
interview question :  Can be class static
Answer : Yes if we use the nested class, class can be static ( inner class can be static only) NOT OUTER
Baska sekilde class static olamaz.

interview question 2 :  what is the advantages static metals from the instance method? Answer is day 34 audio 8 de

When should I use static block :  When we need initialize the static variables,
ok you can assign static variable in the class, but if you need more than one step to initialize
varables far example ArrayList, you must the create static Block

 */