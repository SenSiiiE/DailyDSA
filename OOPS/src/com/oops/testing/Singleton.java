package com.oops.testing;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("I am the constructor...");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
