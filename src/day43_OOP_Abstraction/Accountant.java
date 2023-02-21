package day43_OOP_Abstraction;

public abstract class Accountant extends Personal {

    protected int hourlyPayment;
    protected int monthlyWorkTime;
    protected int salary;

    protected abstract int hourlyPayment();

    protected abstract int monthlyWorkTime();

    protected int salary(int hourlyPayment, int monthlyWorkTime) {
        return hourlyPayment * monthlyWorkTime;

    }


}
