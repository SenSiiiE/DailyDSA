package com.oops.abstractClasses;

public abstract class Parent {
    Parent(){
        System.out.println("I'm the abstract class");
    }
    Parent(String s){
        System.out.println("Im abstract with parameter");
    }
    abstract void career(String name);
}
