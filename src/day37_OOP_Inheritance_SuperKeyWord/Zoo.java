package day37_OOP_Inheritance_SuperKeyWord;

public class Zoo {

    public static void main(String[] args) {

        //----------------- DOG ------------------

        Dog dog = new Dog("Lucy", "Husky", 'F', 4, "Large", "White");

        System.out.println(dog); // Animal{name='Lucy', breed='Husky', gender=F, age=4, size='Large', color='White'}

        dog.bark();  // Lucy is barking
        dog.sleep();  // Lucy is sleeping

        //---------------- CAT ----------------------

        Cat cat = new Cat("Jermy", "Ragdoll", 'M', 5, "Small", "Gray");


        System.out.println(cat); //Animal{name='Jermy', breed='Ragdoll', gender=M, age=5, size='Small', color='Gray'}

        cat.sleep(); // Jermy is sleeping

        //---------------- FISH ----------------------

        Fish fish = new Fish("Nemo", "garbage", 'M', 1, "small", "Blue-White" );

        System.out.println(fish); // Animal{name='Nemo', breed='garbage', gender=M, age=1, size='small', color='Blue-White'}

        fish.swim();  // Nemo is swimming



    }
}
