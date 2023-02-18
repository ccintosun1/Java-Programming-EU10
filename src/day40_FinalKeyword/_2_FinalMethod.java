package day40_FinalKeyword;

public class _2_FinalMethod {

    public final void method() {    // if you don't want to change method you can use final keyword
        System.out.println("Java Programming");
    }
}

/*
class B extends _2_FinalMethod {

    @Override
    public void method() {                          // You cannot @Override final Method
                                                    // It gives compile error.
        System.out.println("Java Programming");

    }

}

 */