package com.String;

public class dotEquals {
    public static void main(String[] args) {
        String a = "Vikash";
        String b = "Vikash";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}
