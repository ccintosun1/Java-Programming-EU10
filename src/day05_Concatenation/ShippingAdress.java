package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {
    /*...*/
        String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        /*

        EX:
        James King
        11821B Jones Branch Dr
        McLean VA 22031A

        */

        // System.out.println(name +"\n"+ buildingNumber+ " " +streetName+ "\n"+city+ " "+ state +" "+ zipCode);

        String adress = name +"\n"+ buildingNumber+ " " +streetName+ "\n"+city+ " "+ state +" "+ zipCode;

        System.out.println("adress = " + adress);  // 1    1 and 2 is the same
        System.out.println(adress);                // 2


    }




}
