package day31_Constructors;public class _03_Person {    public String name;    public char gender;    public int age;    public _03_Person(String name, char gender, int age) {        this.name = name;        this.gender = gender;        this.age = age;    }    public String toString() {        return "_03_Person{" +                "name='" + name + '\'' +                ", gender=" + gender +                ", age=" + age +                '}';    }}