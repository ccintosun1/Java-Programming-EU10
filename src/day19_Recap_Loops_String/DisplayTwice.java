package day19_Recap_Loops_String;public class DisplayTwice {    public static void main(String[] args) {        String str = "accffiiizz";        String result = "";        for (int i = 0; i < str.length(); i++) {            char ch = str.charAt(i);            int freq = 0;            for (int j = 0; j < str.length(); j++) {                char each = str.charAt(j);                if (ch == each) {                    freq++;                }            }            if (freq == 2) {                if (result.contains("" + ch)) {                    continue;                }                result += "" + ch;            }        }        System.out.println("result = " + result);    }}