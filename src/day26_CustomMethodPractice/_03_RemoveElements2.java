package day26_CustomMethodPractice;import utility.ArraysUtility;public class _03_RemoveElements2 {    //                                {1,2,3,4,3}        4    public static int[] removeElement(int[] array, int index) {        if (index < 0 || index > array.length - 1) {            System.err.println("Invalid Index: " + index);            System.exit(0);        }        int[] result = {};        for (int i = 0; i < array.length; i++) {            if (i != index) {                result = ArraysUtility.addElement(result, array[i]);            }        }        return result;    }}