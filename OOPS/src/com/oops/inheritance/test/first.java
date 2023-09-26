package com.oops.inheritance.test;

public class first {
    public static void greeting(){
        System.out.println("Im first");
    }
}
class second extends first{
//    public static void greeting(){
//        System.out.println("Im second");
//    }
}
class Main{
    public static void main(String[] args) {
        second obj = new second();
        obj.greeting();
    }
}