package day34_GarbageCollection_AccesModifiers;

import day30_CustomClass._02_Dog;
import day30_CustomClass._04_Student;
import day32_Constructors._4_Car;
import day33_Statics._1_Student;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_GarbageCollection {

    public static void main(String[] args) {

        // int n = null; it cannot be OLMAZ...

        String str = null;  // special value.  Only use for NON-Primitive data types
        // null : not Existing ...

        String str1 = "";  // This is NOT Null, This is an object emty


        // System.out.println(str.toUpperCase());  // it gives  Compile ERROR. Hiclik method kabul etmez.
        System.out.println(str1.toUpperCase());    // it canNOT gives Error, empty method kabul eder.

        System.out.println("--------------------------------------------");

        String str2 = "Wooden Spoon";
        System.out.println(str2);  // It is not eligible to garbage collection.

        str2 = null;  // niw str2 is the eligible to garbage collection

        _4_Car car1 = new _4_Car("Toyota");

        car1 = null;  // now eligible to garbage collection Automatically finalize() method executes

        System.out.println("---------------------------------------------");

        _02_Dog dog1 = new _02_Dog();  // asagida dog1 e yeni object create edildigi icin bu object eligible to gabage collection
        dog1.name = "Lucy";

        dog1 = new _02_Dog();
        dog1.name = "Max";

        System.out.println(dog1);  // _02_Dog{name='Max', gender= , age=0, breed='null', size='null', color='null'}

        System.out.println("-----------------------------------------------");

        String language = "Python";  // object created
        language = "Java";    // language artik Java ya esitlenip yeni bir object create edilince Python objesi gabage collection oldu.
        System.out.println(language);  // Java

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;  // bir objeye 2 lish olusturmus olduk. T wo variable point the same object
        list2.addAll(Arrays.asList(200, 300, 400));  // Bu sebeple list1 ve List2 ye ne eklersen ekle ikisi degisecektir.
        //

        System.out.println(list1);  // [100 , 200 , 300 , 400]
        System.out.println(list2);  // [100 , 200 , 300 , 400]

        System.out.println(list1 == list2); // same object old. icin true

        System.out.println("-----------------------------------------------------");

        _1_Student student1 = new _1_Student("Tahir", 'M', 33, 14, 'B');
        student1.grade = 'A';

        _1_Student student2 = student1;   // tek objeye 2 tane nish baglamis olduk her ikisi de tek objeye etki eder ve refere eder.
        student2.name = "Ahmet";

        System.out.println(student1);  // _1_Student{name='Ahmet', gender=M, age=33, studentID=14, grade=A}
        System.out.println(student2);  // _1_Student{name='Ahmet', gender=M, age=33, studentID=14, grade=A}

        System.out.println("---------------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();   // first room
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>();   // second room

        l2 = l1;  // Burada l2 nin object yani second room Garbage collection oldu.

        System.out.println(l2);  // [Java]


    }
}
