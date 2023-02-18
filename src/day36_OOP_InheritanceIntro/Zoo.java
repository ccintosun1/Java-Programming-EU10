package day36_OOP_InheritanceIntro;

public class Zoo {

    public static void main(String[] args) {

        //----------------- DOG ------------------

        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.breed = "Husky";
        dog.gender = 'F';
        dog.age = 4;
        dog.size = "Large";
        dog.color = "White";

        System.out.println(dog); // Animal{name='Lucy', breed='Husky', gender=F, age=4, size='Large', color='White'}

        dog.bark();  // Lucy is barking
        dog.sleep();  // Lucy is sleeping

        //---------------- CAT ----------------------

        Cat cat = new Cat();
        cat.name = "Jermy";
        cat.breed = "Ragdoll";
        cat.gender = 'M';
        cat.age = 5;
        cat.size = "Small";
        cat.color = "Gray";

        System.out.println(cat); //Animal{name='Jermy', breed='Ragdoll', gender=M, age=5, size='Small', color='Gray'}

        cat.sleep(); // Jermy is sleeping

        //---------------- FISH ----------------------

        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.breed = "garbage";
        fish.gender = 'M';
        fish.size = "small";
        fish.age = 1;
        fish.color = "Blue-White";

        System.out.println(fish); // Animal{name='Nemo', breed='garbage', gender=M, age=1, size='small', color='Blue-White'}

        fish.swim();  // Nemo is swimming



    }
}
