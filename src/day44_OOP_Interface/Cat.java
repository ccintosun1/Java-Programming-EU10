package day44_OOP_Interface;

public  class Cat extends Animal implements Playable {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {
        System.out.println(name + "can play");
    }

    @Override
    public void playBall() {

    }

    public static void main(String[] args) {

        Animal cat1 = new Cat();
        cat1.name = "Lokum";
        cat1.breed = "StreetCat";
        cat1.gender = 'F';
        cat1.color = "Black";

        System.out.println(cat1);
        System.out.println(cat1.name + " canPlay : " +canPlay);

    }

}
