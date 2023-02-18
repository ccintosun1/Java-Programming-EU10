package day22_MultiDimensionalArray;import java.sql.SQLOutput;import java.util.Arrays;public class _03_MultiDimensionalArrayIntro {    public static void main(String[] args) {        String[] group1 = {"Jon", "Joes", "James"};        String[] group2 = {"Aaron", "Shay", "Breanna"};        String[] group3 = {"Cassandra", "Tahir", "Aygun"};        String[][] groups = new String[3][];  // index: 0,1,2        groups[0] = group1;        groups[1] = group2;        groups[2] = group3;        //---- toString() Method is for one dimensional array ----- WRONG WAY ------//        //System.out.println(Arrays.toString(groups));  // DON,T do that  [[Ljava.lang.String;@3f0ee7cb, [Ljava.lang.String;@75bd9247, [Ljava.lang.String;@7d417077]        //---- deepToString() Method is for multi dimensional array----  RIGHT WAY ------//        System.out.println(Arrays.deepToString(groups)); // [[Jon, Joes, James], [Aaron, Shay, Breanna], [Cassandra, Tahir, Aygun]]        System.out.println("---------------------------------------------------------");        /*            {1,2,3}            {4,5,6,7}            {8,9,10,11,12}         */        // 2 dimensional array//index of the elements:  0  1  2    0  1  2  3    0  1   2   3   4     starts all array index number is 0 (zero)        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};  // 2D [][] means 2 different indexes.//index of arrays  :         0            1                 2        //------------------ Print Multi Dimensional Array ------------------ //        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]        //------ Print Element One Single Array in Multi dimensional array  Array -------- //        // [4, 5, 6, 7]        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]        //------ Print Element from Single dimensional Array in Multi dimensional array  Array -------- //        System.out.println(arr2D[2][3]);  //11  We cannot use toString Method to Print Element of Single Array    }}