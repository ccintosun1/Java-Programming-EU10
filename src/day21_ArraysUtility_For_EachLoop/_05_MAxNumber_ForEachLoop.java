package day21_ArraysUtility_For_EachLoop;public class _05_MAxNumber_ForEachLoop {    public static void main(String[] args) {        int[] numbers = {10, 5, 4, 20, 1, 0};        //index number :  0  1  2   3  4  5        int max = numbers[0];   // 10   Automatically assigned      /*  for (int i = 0; i < numbers.length; i++) {            if (numbers[i] > max){  //  If there is element in the array, that's greater than the current max number                max = numbers[i];   //  Assigning greater number to variable Max            }        }        System.out.println(max);          // if press  "COMMENT" + "(-)"  buttons together You can shrink the comment or code block*/        for (int each : numbers) {   // int each = numbers[i gibi] = sira ile 10,5,4,20,1,0  each bu demektir.            if (each > max) {        //                max = each;            }        }        System.out.println(max);  // 20    }}