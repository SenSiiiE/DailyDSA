package com.oops;

public class SingeltonClass {
    private static SingeltonClass SingeltonClass_instance = null;

    private SingeltonClass(){
        System.out.println("i am Singleton Class..");
    }

    public static SingeltonClass getInstance(){
        if(SingeltonClass_instance == null){
            SingeltonClass_instance = new SingeltonClass();

        }
        return SingeltonClass_instance;
    }
}

class Main{
    public static void main(String[] args) {
        SingeltonClass x = SingeltonClass.getInstance();
        SingeltonClass y = SingeltonClass.getInstance();
        SingeltonClass z = SingeltonClass.getInstance();

        System.out.println(z.hashCode());
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        if(x == y && y == z){
            System.out.println("three objects are same...");
        }
    }
}
