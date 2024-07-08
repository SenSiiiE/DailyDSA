package com.oops.inheritance.test;

public interface A {
    void run();
//    default void show(){
//        System.out.println("interface A");
//    }
}

interface B{
    void run();
//    default void show(){
//        System.out.println("interface B");
//    }
}

class C implements A, B{
    public void run(){
        System.out.println("Class C is running ....");
    }

}

class MainInterface{
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.run();
    }
}
