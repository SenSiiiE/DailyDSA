package com.oops.testing;

public class child {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        if(obj1 == obj2 && obj2 == obj3){
            System.out.println("Three variables referencing to same objects.. ");
        }

    }
}
