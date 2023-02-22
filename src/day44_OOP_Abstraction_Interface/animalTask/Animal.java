package day44_OOP_Abstraction_Interface.animalTask;

/*
class Test{
    public static void main(String[] args) {

        // ---- The differences getName and getSimpleName -----------//
        System.out.println(new Test().getClass().getSimpleName()); // Test
        System.out.println(new Test().getClass().getName());       // day44_OOP_Abstraction_Interface.animalTask.Test

        //getName de package and subpackage nameini de yaziyor.



    }

}
*/

public abstract class Animal {



    //--------------- Atrributes--------------------//
    private String name;
    private final String breed;  // static olamaz cunku tum hayvanlarin breedleri ayni olur.
    private final char gender;
    private int age;
    private String size;
    private final String color;
    public final static boolean canBreath;
    // static mean is one copy
    // final mean you cannot change the value that given

    // -------- static blockdaki variable bir kere class da calisir ve sonra -------//
    // cagirilan tum class da bu deger tekrar calismadan kullandirilir.
    static {
        canBreath = true;
        if (canBreath == false) {
            throw new RuntimeException("Invalid");
        }
    }

    //---------------------- Constructor ------------------------------------//
    // NOT : constructor private olursa object create edilmez.
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);        // setter olanlara this.name = name yazmiyoruz. Cunku bunlarin degerleri setterdan gelicek
                              // setName methoduna gitsin kondition dogru ise buraya versin esitlensin diyor HARIKA
        this.breed = breed;   // bunlar zaten final oldugu icin set edilme sansi yok sadece tek sefer value alirlar.
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("invalid gender : " + gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);

        this.color = color;
    }

    // ----------------------- getter and Setter Method--------------------------//
    // Private Attributeleri baska classlarda kullanmaizi saglar
    // GETTER : Attribute u getirir. Return doner
    // SETTER ise value yu ayarlar SET :Vermek  / Return donmez
    public String getName() {
        return name;
    }

    public void setName(String name) {   // eger name Attribute unun set methodu olmasa
        if (name.isEmpty()) {             // bu if conditionu Constructorda yazmak zaorunda kalicaktik.
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){        // cairildiginada tek sefer calisip name tek sefer alacagi ve direk sonuc cekecegi
                                     // icin final olabilmekte
        System.out.println(name + " is drinking");
    }

    public abstract void eat();    // abtract da body olmaz.


    @Override
    public String toString() {
       // return "Animal " +   // eskisi
        return getClass().getSimpleName() + "{" +   // Animal --> yenisi cunku boylece ilgili class in  basit ismini ve degerlerini otomatik ediyor.
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
	Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake

 */

