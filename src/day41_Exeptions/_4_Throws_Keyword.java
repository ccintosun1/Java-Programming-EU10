package day41_Exeptions;

public class _4_Throws_Keyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        Thread.sleep(3000);    // in normally it commend gives check exceptions
        // 3 sn ye sonra "World" u yazdiracak

        System.out.println("World");

        Thread.sleep(4000);         // check exceptions uzerine gelince kirmizi ampule tukla
        // 4 sn sonra ise How are you? yadiracak

        System.out.println("How are you?");

        Test();
        Test2();

    }

    public static void sleep5seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void Test() {

        try {
            sleep5seconds();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test() Method will wait 5 sedonds");
    }

    public static void Test2() {
        Test();

        System.out.println("We called Test() Method in the Test2() Method, means the program will vait 5 seconds mpre");
    }

}
