package day43_OOP_AbstractClasses;

public abstract class Personal {

    static final String companyName = "Cydeo";
    static final String companyAdress = "USA";

    protected String name = "No Value";
    protected String surname = "No Value";
    protected String Id = "No Value";
    protected String Number = "No Value";
    protected String JobStartTime = "No Value";
    protected String HealthNo = "No Value";
    static int personalCounter = 1000;

    protected String personalNo;

    protected String PersonalNo(){
        personalCounter++;
        return personalCounter + "";
    }

}
