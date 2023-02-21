package day43_OOP_Abstraction;

public class Employee extends Accountant {

    @Override
    protected int hourlyPayment() {
        return 45;
    }

    @Override
    protected int monthlyWorkTime() {
        return 180;
    }

    public String toString() {
        return "day43_OOP_AbstractClasses.Employee{" +
                "companyName=" + companyName +
                "companyAdress=" + companyAdress +
                "hourlyPayment=" + hourlyPayment +
                ", monthlyWorkTime=" + monthlyWorkTime +" \n" +
                ", salary=" + salary(hourlyPayment,monthlyWorkTime) +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id='" + Id + '\'' +
                ", Number='" + Number + '\'' +
                ", JobStartTime='" + JobStartTime + '\'' +
                ", HealthNo='" + HealthNo + '\'' +
                ", personalNo='" + personalNo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.hourlyPayment = employee1.hourlyPayment();
        employee1.monthlyWorkTime = employee1.monthlyWorkTime();
        employee1.salary(employee1.hourlyPayment, employee1.monthlyWorkTime);
        employee1.name = "Hasan";
        employee1.surname = "Can";

        System.out.println(employee1);

    }
}
