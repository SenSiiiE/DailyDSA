package com.Array;

import java.util.Arrays;

public class shiftNegative {
    public static void main(String[] args) {
        int[] a = new int[]{-1,2,3,-9,-7,5};
//        System.out.println(Arrays.toString(shiftLeft(a)));
        shiftTwoPointer(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] shiftLeft(int[] a){
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0){
                if(i != j){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        return a;
    }
    static void shiftTwoPointer(int[] a){
        int left = 0;
        int right = a.length - 1;
        while(left <= right){
            if(a[left] < 0 && a[right] < 0){
                left++;
            }else if(a[left] > 0 && a[right] < 0){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (a[left] > 0 && a[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
    }
}
