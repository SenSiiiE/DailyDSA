package com.codingRound;

import java.util.Arrays;

public class mergeSort {
    static int[] a = {15, 5, 24, 8, 1, 3, 16, 10, 20};
    static int[] b = new int[a.length];
    public static void main(String[] args) {
        MergeSort(0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void MergeSort(int lb, int ub) {
        if(lb < ub){
            int mid = (lb + ub) / 2;
            MergeSort(lb, mid);
            MergeSort(mid + 1, ub);
            Merge(lb, mid, ub);
        }
    }

    private static void Merge(int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        while(i <= mid && j <= ub){
            if(a[i] <= a[j]){
                b[k] = a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i > mid){
            while(j <= ub){
                b[k] = a[j];
                k++;
                j++;
            }
        }else{
            while(i <= mid){
                b[k] = a[i];
                i++;
                k++;
            }
        }
        for(int n = lb; n <= ub; n++){
            a[n] = b[n];
        }
    }
}
