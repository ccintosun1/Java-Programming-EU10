package day09_IfStatements.day24_CustomMethod_Return;public class _10_ReturnMethodPractice4 {    public static void main(String[] args) {        String str = "cccccccccccddaaaaaaaaaaaaaaabbbbbbbbbbb";        str = removeDuplicate(str);        System.out.println(str); // cdab    }    	//1. create a method that can remove duplicated characters from a string and returns the new value		public static String removeDuplicate(String str)	{   // "aaabcc"  ==> "abc"        String result = "";            for (int i = 0; i < str.length(); i++) {                char each = str.charAt(i);                if (!result.contains(""+each)){     // contains gives us String                    result += each;                }            }            return result;        }}