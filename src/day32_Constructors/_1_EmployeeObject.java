package day32_Constructors;

public class _1_EmployeeObject {

    public static void main(String[] args) {

        _1_Employee employee1 = new _1_Employee("Mesut");

        _1_Employee employee2 = new _1_Employee("Cemil", 'M');

        _1_Employee employee3 =new _1_Employee("Oznur", 'F', "SDET");

        _1_Employee employee4 =new _1_Employee("Okan", 'M', "SDET", 227500);



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }
}
