package com.oops.Polymorphism;

public class toStringOverriding {
    public static void toString(int[] a){
        System.out.println("STFU");
    }
}

class child2{
    public static void main(String[] args) {
        toStringOverriding.toString(new int[]{1,2,3});
    }
}
