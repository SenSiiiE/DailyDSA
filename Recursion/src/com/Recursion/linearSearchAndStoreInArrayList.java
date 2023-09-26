package com.Recursion;

import java.util.ArrayList;

public class linearSearchAndStoreInArrayList {
    public static void main(String[] args) {
        int[] arr = {3,1,5,7,3,11};
        findAllSearch(arr, 3, 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllSearch(int[] arr, int target, int start){
        if(start == arr.length) return;
        if(arr[start] == target) list.add(start);
        findAllSearch(arr, target, start+1);
    }
}
