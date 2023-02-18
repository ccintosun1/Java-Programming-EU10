package day25_CustomMethod_MethodOverloading;import utility.ArraysUtility;import java.util.Arrays;public class _08_testForArraysUtilityClass {    public static void main(String[] args) {        int[] arr1 = {1, 2, 3, 4, 5};        ArraysUtility.printEach(arr1);        double[] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};        ArraysUtility.printEach(arr2);        double[] arr3 = {'A', 'B', 'C', 'D', 'E'};        ArraysUtility.printEach(arr2);        String[] names = {"Ahmet", "Mehmet", "Cemil", "Oznur", "Balsifa"};        ArraysUtility.printEach(names);        System.out.println("------------------find max number--------------------");        int[] n1 = {2, 6, 4, 6, 3, 5, 89, 9, 43, 4, 6};        int max1 = ArraysUtility.max(n1);        System.out.println("max1 = " + max1); //max1 = 89        double[] n2 = {3.5, 7.5, 45.2, 33.1, 92.3, 2.1, 66.2};        double max2 = ArraysUtility.max(n2);        System.out.println("max2 = " + max2);  // max2 = 92.3        System.out.println("------------------find min number--------------------");        int[] n3 = {2, 6, 4, 6, 3, 5, 89, 9, 43, 4, 6};        int min3 = ArraysUtility.min(n3);        System.out.println("min3 = " + min3); // min3 = 2        double[] n4 = {3.5, 7.5, 45.2, 33.1, 92.3, 2.1, 66.2};        double min4 = ArraysUtility.min(n4);        System.out.println("min4 = " + min4);  // min4 = 2.1        System.out.println("------------------ array contains element --------------");        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};        boolean r1 = ArraysUtility.contain(a1, 5);        System.out.println("r1 = " + r1);  // r1 = true        char[] a2 = {'A', 'B', 'C', 'D', 'E'};        boolean r2 = ArraysUtility.contain(a2, 'c');        System.out.println("r2 = " + r2);  // r2 = false        System.out.println("------------------ merge 2 arrays --------------");        int[] array1 = {1, 2, 3, 4, 5};        int[] array2 = {6, 7, 8, 9, 10};        int[] merge = ArraysUtility.merge2Array(array1, array2);        System.out.println(Arrays.toString(merge)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]        //--------        double[] array3 = {1.5, 2.5, 3.2, 4.6, 5.7};        double[] array4 = {65, 2, 72.4, 80.5, 9, 5, 10, 6};        double[] merge1 = ArraysUtility.merge2Array(array3, array4);        System.out.println(Arrays.toString(merge)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]    }}