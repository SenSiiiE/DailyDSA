package com.codingRound;

import java.util.Arrays;

public class quickSort {
    static int[] a = {15, 5, 24, 8, 1, 3, 16, 10, 20};
    static void quick(int lb, int ub){
        if(lb < ub){
            int loc = partition(lb, ub);
            quick(lb, loc - 1);
            quick(loc + 1, ub);
        }
    }

    private static int partition(int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while(start < end){
            while(start <= ub && a[start] <= pivot){
                start++;
            }
            while(a[end] > pivot){
                end--;
            }
            if(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;
        return end;
    }

    public static void main(String[] args) {
        quick(0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
