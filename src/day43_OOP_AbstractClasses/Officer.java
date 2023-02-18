package day43_OOP_AbstractClasses;

public class Officer extends Accountant {

    @Override
    protected int hourlyPayment() {
        return 0;
    }

    @Override
    protected int monthlyWorkTime() {
        return 0;
    }
}
