package com.oops.abstractClasses;

public class Son extends Parent{
    Son(){
        super("Vikash");
        System.out.println("Son constructor");
    }
    @Override
    void career(String name) {
        System.out.println("I want to be a "+ name);
    }

}
