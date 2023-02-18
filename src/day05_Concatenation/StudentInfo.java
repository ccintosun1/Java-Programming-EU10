package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {

        /*decleare variable:

        dataType variablesname = data;

        2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)

                WARNING : "123" is text(String) not number / 123 is number (int or whatever)
                "123" + 1 = 1231;
                 123  + 1 = 124
            GPA açılımı “Grade Points Average” olan öğrencilerin akademik performansını
           değerlendirmek amacıyla kullanılan bir sistemdir. Türkçede ise “ağırlıklı not
           ortalaması” olarak bilinen GPA, öğrencileri akademik başarılarına göre sıralamak için gereklidir.
        */

        String student_name = "Cemil";
        int age = 45;
        char gender = 'M';
        String school_name = "Cydeo";
        String phone_number = "(123)-456-7891";
        String phone_number2 = "(123)-456-7892";  // you cannot give same variable names to the numbers.
        boolean isFullTime = true;
        double GPA = 2.5;

        System.out.println("student_name = " + student_name);
        System.out.println("age          = " + age);
        System.out.println("gender       = " + gender);
        System.out.println("school_name  = " + school_name);
        System.out.println("phone_number = " + phone_number);
        System.out.println("phone_number2 = " + phone_number2);
        System.out.println("isFullTime   = " + isFullTime);
        System.out.println("GPA          = " + GPA);







    }




}
