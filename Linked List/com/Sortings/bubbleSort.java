package com.Sortings;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,1,5,4};
        bubble(arr);
    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
