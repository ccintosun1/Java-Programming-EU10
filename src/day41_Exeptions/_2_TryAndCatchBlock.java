package day41_Exeptions;

public class _2_TryAndCatchBlock {

    public static void main(String[] args) {

        try{
            System.out.println( 9/0 );
            System.out.println("Try Block");

        }catch (RuntimeException e){   // preferable exception variable is e
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("Catch Block");
            System.exit(0);
        }

        finally {
            System.out.println("Finally Block");
        }

        System.out.println("Hello");

    }
}
