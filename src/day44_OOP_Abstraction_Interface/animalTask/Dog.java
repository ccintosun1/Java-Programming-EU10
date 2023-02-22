package day44_OOP_Abstraction_Interface.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color); // to call the parent class constructor
    }

    public void bark(){
        System.out.println(getName() + "is barking");
    }


    @Override
    public void eat() { // soldaki sekil overriden i gosterir.
        System.out.println(getName() + " eats Pizza"); // we use getNAme because name attribute is private
    }
}
