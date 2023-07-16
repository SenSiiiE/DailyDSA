package com.Recursion;

public class printRec {
    public static void main(String[] args) {
        getP(5);
    }
    static void getP(int n){
        if(n == 1) System.out.println(1);
        else {
            System.out.println(n);
            getP(n-1);
            System.out.println(n);
        }
    }
}

