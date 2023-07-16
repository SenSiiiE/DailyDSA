package com.pattern;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {3,4,9,2,1};
        selectionSort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr, int index, int base, int min){
        if(index > arr.length-1) return;
        if(index <= arr.length-1){
            if(arr[min] > arr[index]){
                min = index;
                selectionSort(arr, ++index, base, min);
            }else{
                selectionSort(arr, ++index, base, min);
            }

        }
            int temp = arr[base];
            arr[base] = arr[min];
            arr[min] = temp;
            selectionSort(arr, base+1, base+1, base+1);

    }
}
