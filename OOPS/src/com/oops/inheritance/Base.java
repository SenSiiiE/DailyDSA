package com.oops.inheritance;

public class Base {
    Base(String str){
        System.out.println("Base class constructor.." +str);
    }
}
class derivedBase extends Base{
    derivedBase(){
        super("lol");
        System.out.println("Derived class constructor..");
    }
}

class MainBase{
    static {
        System.out.println("Im first static");
    }
    public static void main(String[] args) {
        derivedBase derived = new derivedBase();

    }
}
