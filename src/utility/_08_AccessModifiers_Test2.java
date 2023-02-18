package utility;

import day34_GarbageCollection_AccesModifiers._08_AccessModifiers;

import static day34_GarbageCollection_AccesModifiers._08_AccessModifiers.*;

public class _08_AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(publicData);  // visible in all package and class in the same project
        //System.out.println(defaultData); // visible only under the same package
        //System.out.println(privateData);  // visible only under the same class

        _08_AccessModifiers.method1();
        //_08_AccessModifiers.method2();
        //_08_AccessModifiers.method3();

    }
}

 class B{   // Create ettigin class icinde yanlizca 1 public class olabilr ve bu
                   // public olan class Class ismi ile ayni olan class olmak zorunda ve
                   // o class icinde create edecegin diger classlar public ve private olamaz
                   // sadece  default olmali / olabilir.

}