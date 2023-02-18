package day44_OOP_Interface;

public abstract class Animal {

    public String name;
    public String breed;
    public char gender;
    public String color;


    public abstract void eat();

    public abstract  void sleep();

    @Override
    public String toString() {
        return "day43_OOP_Interface.Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}


