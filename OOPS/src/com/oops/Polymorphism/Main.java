package com.oops.Polymorphism;

public class Main {
    String msg = "Hello World!!";

    public static void display(String a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes circle1 = new circle();

        circle1.area();

//        Main.display("hello");
        Main a = new Main();
        display(a.msg);
    }
}
