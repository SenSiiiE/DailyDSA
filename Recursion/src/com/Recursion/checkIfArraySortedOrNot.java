package com.Recursion;

public class checkIfArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,5};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr, int start) {
        if(start== arr.length) return true;
        if(start<arr.length-1){
            if(arr[start]<arr[start+1]) return isSorted(arr, start+1);
            else return false;
        }
        return true;
    }
}
