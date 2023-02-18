package day34_GarbageCollection_AccesModifiers;

public class _08_AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;         // access modifier : default  // Birsey yazmazsan default oluyor.
    private static int privateData = 300;


    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);  // 100
        System.out.println(defaultData); // 200
        System.out.println(privateData); // 300 // private is not visible outside this class

        // These public default and private Access Modifiers can execute in the same class...

    }

}
