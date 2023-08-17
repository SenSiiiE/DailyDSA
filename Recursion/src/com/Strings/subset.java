package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(subDuplicate(arr));

    }

    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add (new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add (new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;
            if( i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start; j < n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        Collections.min(outer.get(0));
        return outer;
    }
}
