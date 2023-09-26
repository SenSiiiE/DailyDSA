package com.oops.Polymorphism;

public class returnTypeOverloading {
    public static void main(String[] args) {
        add(1,2,3);
//        main(new String[]{}, 4);
    }
//    public static void main(String[] args){
//        System.out.println("Overloaded Main function....");
//    }

    static int add(int a, int b){
        return a + b;
    }
    static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
