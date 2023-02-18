package day34_GarbageCollection_AccesModifiers;

import static day34_GarbageCollection_AccesModifiers._02_Circle.*;


// import static utility.MathUtility.sum;  // utilities package den
                                        // MathUtility class indan sum static methoducu import ettik

import static utility.MathUtility.*;  // utilities package den MathUtility classindaki tum sattic
                                      // variable and methodlari import ettik ki tum ihtiyaclari kullanalim

public class _06_StaticImportTest {

    public static void main(String[] args) {

        System.out.println(pi);  // 3.14
        System.out.println(name);  // Circle
        System.out.println(numbers); // [10, 20]

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1  = sum(1,20);
        System.out.println(r1); // 21

        // find the sum of 100, 100
        int r2 = sum(100,200);
        System.out.println(r2);  // 300

        int r3 = subtract(100,50);
        System.out.println(r3);  // 50

        int r4 = maxNumber(1000,2000);
        System.out.println(r4);  // 2000

    }
}
