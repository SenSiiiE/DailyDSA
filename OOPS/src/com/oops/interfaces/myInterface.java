package com.oops.interfaces;

public interface myInterface {
    default void print(){
        System.out.println("hii1");
    }

}
interface myInterface2{
    default void print(){
        System.out.println("hii2");
    }
}
class A implements myInterface, myInterface2{
    public void print(){
        myInterface.super.print();
        myInterface2.super.print();
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.print();

    }
}

