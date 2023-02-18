package day34_GarbageCollection_AccesModifiers;

public class _08_AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(_08_AccessModifiers.publicData);
        System.out.println(_08_AccessModifiers.defaultData);
        //System.out.println(_08_AccessModifiers.privateData); // private is not visible
        // and reachable out of the different class in the same package.

        _08_AccessModifiers.method1();  // public
        _08_AccessModifiers.method2();  // default
       // _08_AccessModifiers.method3(); // it is not visible Because ist is private method
                                       // private method only can execute same class



    }

}
