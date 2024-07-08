package com.Array;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1,2,3,4,5})));
    }
    static int[] reverse(int[] a){
        for (int i = 0; i <= a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }
}
