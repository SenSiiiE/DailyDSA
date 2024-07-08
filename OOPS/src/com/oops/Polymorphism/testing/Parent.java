package com.oops.Polymorphism.testing;

public class Parent {
    int num = 5;
    int marks = 100;
    public void run(){
        System.out.println("I am Parent...");
    }
}

class child extends Parent{
    int num = 1;
    int marks = 99;
    public void run(){
        System.out.println("I am Child...");
    }
}

