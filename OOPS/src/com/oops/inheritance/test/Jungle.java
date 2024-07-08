package com.oops.inheritance.test;

public class Jungle {
    String a = "Jungle";
    public void show(){
        System.out.println("I am show");
    }
}
class tiger extends Jungle{
    String a = "tiger";
    public void show(){
        System.out.println("I am tiger...");
    }
}

class elephant extends Jungle{
    String a = "elephant";
//    public void show(){
//        System.out.println("I am elephant...");
//    }
}

class MAIN2 {
    public static void main(String[] args) {
        elephant e = new elephant();
        e.show();
        System.out.println(e.a);
        Jungle j = new elephant();
        j.show();
        System.out.println(j.a);
        Jungle j2 = new Jungle();
        j2.show();
        System.out.println(j2.a);
    }
}