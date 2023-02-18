package day35_OOP_Encapsulation;

public class Employee {

    //---------- Instance Variable -----------//
    private String name;
    private double salary;

    //------- first private instance variable getter and setter methods ------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //------- second private instance variable getter and setter methods ------//

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0){
            System.err.println("Invalid Salary" + salary);
            System.exit(0);
        }

        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
