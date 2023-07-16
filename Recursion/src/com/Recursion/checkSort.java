package com.Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class checkSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 6, 5};
        System.out.println(findAllIndex(arr, 0, 5));
    }

    private static boolean sorted(int[] arr, int start) {
        if(start == arr.length-1) return true;

        return arr[start]<arr[start+1] && sorted(arr, start+1);
    }

    private static int linearSearch(int[] arr, int start, int target){
        if(arr[start] == target) return start;
        else if(start == arr.length-1 && arr[start] != target) return -1;
        return linearSearch(arr, start+1, target);
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int start, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length) return list;
        else if(arr[start] == target) list.add(start);
        return findAllIndex(arr, start+1, target);
    }
}
