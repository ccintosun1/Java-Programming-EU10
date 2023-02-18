package day35_OOP_Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        //employee1.name = "Josh";       You can NOT call like this you can get COMPILE ERROR
        //employee1.salary = 120000;

        employee1.setName("Josh");
        employee1.setSalary(223000);

        System.out.println(employee1.getName());   // Josh
        System.out.println(employee1.getSalary());  // 223000


    }
}
