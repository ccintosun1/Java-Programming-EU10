package day44_OOP_Abstraction_Interface.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating biryani");
    }

    public void Meow(){
        System.out.println(getName() + " is meowing");
    }



}
