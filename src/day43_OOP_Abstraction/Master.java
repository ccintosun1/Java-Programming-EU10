package day43_OOP_Abstraction;

public class Master extends Employee{
    @Override
    protected int hourlyPayment() {
        return 55;
    }

    @Override
    protected int monthlyWorkTime() {
        return 180;
    }
}
