package com.Sortings;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,1,5,4};
        insertion(arr);
    }

    private static void insertion(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while( j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
