package day17_Branching_Do_While_WhileLoop;public class DoWhileLoopIntro {    public static void main(String[] args) {    //---------------------while loop-----------if Condition is true do it---------------------        boolean a = false;        while (a){            System.out.println("Wooden Spoon  -- whle loop ");            System.out.println("-------------------------------");   //-------------------do while loop------------JUST DO IT FIRST----------------------------            do {                System.out.println("Wooden Spoon -- do-while loop"); // at least one time is printing            }while (a);        }    }}