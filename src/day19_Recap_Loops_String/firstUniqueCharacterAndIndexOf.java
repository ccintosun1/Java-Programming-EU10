package day19_Recap_Loops_String;public class firstUniqueCharacterAndIndexOf {    public static void main(String[] args) {        String str = "aabccnsksi";        String result = "";        for (int i = 0; i < str.length(); i++) {            char ch = str.charAt(i);            if (str.indexOf(ch) == str.lastIndexOf(ch)) {                result = "" + ch;                System.out.println(result + " is first unique character of the string and its index number is: " + str.indexOf(result));   // 2                System.exit(0);            }        }        /*        4. Write a program that can return the index number of the first unique character.         */    }}