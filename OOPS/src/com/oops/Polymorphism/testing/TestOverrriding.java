package com.oops.Polymorphism.testing;

public class TestOverrriding {
    public static void main(String[] args) {
        child ob = new child();
        Parent ob2 = new Parent();
//        child ob3 = new Parent();
        Parent ob4 = new child();

        ob.run();
        ob2.run();
//        ob3.run();
        ob4.run();
//        System.out.println(ob.num);
//        System.out.println(ob.marks);
//        System.out.println(ob2.num);
//        System.out.println(ob2.marks);
//        System.out.println(ob4.num);
//        System.out.println(ob4.marks);
    }
}
