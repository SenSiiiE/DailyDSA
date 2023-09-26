package com.oops.testing;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
//        rotate(a, 0, 2);
//        rotate(a, 3, a.length - 1);
//        rotate(a, 0, a.length-1);
        int K = 3;
        K = K % A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, A.length - K - 1);
        reverse(A, A.length - K, A.length - 1);
        System.out.println(Arrays.toString(A));
    }
    static void reverse(int[] a, int s, int e){
       while(s < e){
           int temp = a[s];
           a[s] = a[e];
           a[e] = temp;
           s++;
           e--;
       }
    }
}
