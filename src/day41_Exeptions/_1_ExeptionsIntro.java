package day41_Exeptions;

public class _1_ExeptionsIntro {

    public static void main(String[] args) {

        System.out.println("-------------------- unchecked exeptions ---------------------");

        Integer[] arr = {10, 20, 30};

        //System.out.println(arr[20]);   // unchecked exception
        // without handling you cannot excequte the code blocks

        System.out.println("Hello");
        // without handling you cannot excequte the code blocks

        // System.out.println("Java".charAt(-1)); Bunun gibi birsuru hazir methodu yazabilirsin.
        // Bize compile(derleme-codu duzenleme esnasinda hata vermeyen exceptionslara uchecked exceptionslar diyoruz.
        // Derleme esnasinda kod kontrol edilmiyor.
        // Exceptions that are not checked at compile time yani....

        String str = null;
        //System.out.println(str.toUpperCase());  // unchecked exceptions


        System.out.println("------------------ checked exceptions -----------------------");
        // durung compile the java checked code and gives exeptions for corret it

        // 1 - Thread.sleep(3000); // checked exception

        // FileInputStream file = new FileInputStream("FIle Path");  // cehcked exeption







    }
}
