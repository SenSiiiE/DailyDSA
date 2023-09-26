package com.test;

public class Test {
    // Java program to demonstrate use of static blocks

        // static variable
        static int a = 10;
        static int b;

        // static block

        public static void main(String[] args)
        {
            System.out.println("from main");
            System.out.println("Value of a : "+a);
            System.out.println("Value of b : "+b);
        }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

}

