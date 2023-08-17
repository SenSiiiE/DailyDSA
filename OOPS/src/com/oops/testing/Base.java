package com.oops.testing;

public class Base {
    int val;
    String name;
    Base(int val){
        this.val = val;
    }
}

class Main{
    public static void main(String[] args) {
        Base base = new Base(15);
        System.out.println(base.name);
    }
}
