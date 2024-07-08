package com.Array;


import java.util.Arrays;

// Q1. Given an integer array nums, return an array answer such that answer[i] is equal
//     to the product of all the elements of nums except nums[i].
public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(product(a)));
    }

    static int[] product(int[] a){
        int prod = 1;
        for (int i = 0; i < a.length ; i++) {
            prod *= a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = prod / a[i];
        }
        return a;
    }
}
