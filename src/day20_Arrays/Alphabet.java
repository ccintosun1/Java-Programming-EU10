package day20_Arrays;import java.util.Arrays;public class Alphabet {    public static void main(String[] args) {        char[] alphabets = new char[26];  // Z ~ A        /* alphabets[0] = 'Z'; // 90 in ASCII        //------------------- Sadece atanmis elementi gormek icin NOT ARRAY -------------//         System.out.println(alphabets);  // Z  This is not ARRAY This shows us elements        System.out.println(alphabets[0]); // Z   yukaridaki ile ayni elemt NOT ARRAY        //----- toString method ile printi Array olarak goruyoruz yoksa Array olmaz ( THIS IS ARRAY ) ---------//        System.out.println(Arrays.toString(alphabets)); // [Z,  ,  ,  ,  ,  ,  ,  ,  ,  .....]        // -------------------  to See the as an ARRAY, you cannot see specific element as an array because array is a kume demektir  ---------------------------//        System.out.println(Arrays.toString(alphabets)); // [Z,  ,  ,  ,  ,  ,  ,  ,  ,  , ... ]                  i     ch        alphabets[1] = 'Y'; // 89 in ASCII        alphabets[2] = 'X'; // 88 in ASCII   ...   we need Loop*/        // ----------------------------- FIRST SOLUTION TO PRINT ALPHABETS ------------------- //        char ch = 'Z';        for (int i = 0; i < alphabets.length; i++) {            alphabets[i] = ch--;        }        System.out.println(Arrays.toString(alphabets));  // [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]        // ----------------------------- SECOND SOLUTION TO PRINT ALPHABETS ------------------- //        for (char i = 0, k = 'Z'; i < alphabets.length && k > 'A'; i++,k--) {            alphabets[i] = k;        }        System.out.println(Arrays.toString(alphabets)); // [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]    }}