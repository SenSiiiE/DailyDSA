package com.codingRound;

public class XOR {
    public static void main(String[] args) {
        System.out.println(xor(new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5}));
    }
    static int xor(int[] a){
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num ^= a[i];
        }
        return num;
    }
}
