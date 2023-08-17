package com.oops.Polymorphism;

public class numbers {
    int add(int a, int b){
        return a + b;
    }

    String add(String a, int b){
        return a + b;
    }

    double add(double a, int b){
        return a + b;
    }
    void add(Integer num){

    }

    String add(int n){
        return "";
    }

    void add(int... num){}

    public static void main(String[] args) {
        numbers num = new numbers();
        System.out.println(num.add(5,6));
        System.out.println(num.add("f", 6));
    }
}
