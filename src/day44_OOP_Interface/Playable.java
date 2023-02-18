package day44_OOP_Interface;

public interface Playable {

    boolean canPlay = true;

    void play();

    default void playBall(){
        System.out.println("can play football");
    }

}
