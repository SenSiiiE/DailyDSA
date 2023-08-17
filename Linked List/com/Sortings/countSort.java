package com.Sortings;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        count(arr);
    }

    private static void count(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        //find max
        for (int i = 0; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //create new array of size max+1
        int[] count = new int[max+1];
        Arrays.fill(count, 0);

        // count array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        //cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }

        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        System.out.println(Arrays.toString(output));
    }
}
