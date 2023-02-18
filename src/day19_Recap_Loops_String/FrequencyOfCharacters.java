package day19_Recap_Loops_String;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";       //a2b1c3d1

        // outer Loop for
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // each character of str
            int count = 0;

            // inner Loop to find the frequency of each character------------------
            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);    // each Character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains(""+ch)) { // char converted to String
                continue;
            }
                result += ch;
                result += count;

        }


        System.out.println(result);

/*
	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */


    }
}
