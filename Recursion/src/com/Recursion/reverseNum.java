package com.Recursion;

public class reverseNum {
    public static void main(String[] args) {
        System.out.println(rev1(1382));
    }

    private static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;

        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n == 0) return n;

        return (int) (n % 10 * (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1));
    }

    public static int rev1(int n){
        if(n<10) return n;

        return Integer.parseInt(Integer.toString(n%10) + rev1(n/10));
    }
}