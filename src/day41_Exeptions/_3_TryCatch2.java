package day41_Exeptions;

public class _3_TryCatch2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(3000);    // in normally it commend gives check exceptions
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("World");


        try {
            Thread.sleep(4000);         // check exceptions uzerine gelince kirmizi ampule tukla
        } catch (InterruptedException e) {    // ve surround try catch exceptions yazar onu tiklayarak
            e.printStackTrace();            // kolay yoldan hatali blogu try catch ile surround ediyor
        }


        System.out.println("How are you?");
    }
}
