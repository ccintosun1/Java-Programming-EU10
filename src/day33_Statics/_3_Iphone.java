package day33_Statics;// we have 2 modifiers  : instance and static NOT Access Modifier, they are differentpublic class _3_Iphone {    public static String brand = "Apple";    public String model;    public double price;    public static String OS = "IOS";    public String color;    public static String madeIn = "China";    public static boolean hasBattery = true;    public static boolean isTouchScreen = true;    public static boolean hasFaceTime = true;    public static void printOperatingSystem(){  // kesin ayni olacak degismeyecek bir IOS system icin instance method        System.out.println(OS);                 // create etmeye gerek yok. Eger yaparsan gereksiz yere memory harcamak    }                                           // zorunda kalicaksin ve buna gerek yok. Bosuna object create etmene gerek yok.                                                // DAY 33 son slayta baksan static yada instance hangisini create etmen                                                // gerektigini tespit edebilirsin.    /*    public static void printModelANdPrice() {        System.out.println(model + " : " + price);   // Static medals does not except instances    }    */    public void method1(){        System.out.println(model + " : " + price);    }}