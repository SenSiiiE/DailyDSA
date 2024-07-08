package com.Array;

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] a = new int[]{1,0,0,2,0,1,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] a){
        int low = 0;
        int high = a.length - 1;
        int i = 0;

        while(i <= high){
            if(a[i] == 0){
                swap(low, i, a);
                low++;
                i++;
            } else if (a[i] == 1) {
                i++;
            } else {
                swap(i, high, a);
//                i++;
                high--;
            }
        }
    }

    private static void swap(int i, int high, int[] a) {
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;
    }
}
