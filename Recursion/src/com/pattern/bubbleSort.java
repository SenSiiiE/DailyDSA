package com.pattern;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr, int index, int base){
        if(base == 0) return;
        if(index < base) {
            if(arr[index] > arr[index + 1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubble(arr, index+1, base);
        }
        bubble(arr, 0, base-1);
    }
}
